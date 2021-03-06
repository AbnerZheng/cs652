package cs652.j;

import cs652.j.codegen.CodeGenerator;
import cs652.j.codegen.ModelConverter;
import cs652.j.codegen.model.CFile;
import cs652.j.parser.JLexer;
import cs652.j.parser.JParser;
import cs652.j.semantics.ComputeTypes;
import cs652.j.semantics.DefineScopesAndSymbols;
import org.antlr.symtab.GlobalScope;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.antlr.v4.misc.Utils;

import java.io.IOException;

public class JTran {
	public GlobalScope globals = new GlobalScope(null);

	public static void main(String[] args) throws IOException {
		if ( args.length==0 ) {
			System.err.println("$ java cs652.j.JTran [-print] [-tree] [-inspect] [-o output-file] file.j");
			return;
		}
		String C_fileName = null;
		String fileName;
		boolean print = false;
		boolean gui = false;
		boolean inspect = false;
		int i = 0;
		label:
		while ( true ) {
			switch ( args[i] ) {
				case "-o":  // -o output-file
					i++;
					C_fileName = args[i];
					i++;
					break;
				case "-tree":
					gui = true;
					i++;
					break;
				case "-print":
					print = true;
					i++;
					break;
				case "-inspect":
					inspect = true;
					i++;
					break;
				default:
					fileName = args[i];
					String fname = Utils.stripFileExtension(fileName);
					if ( C_fileName==null ) {
						C_fileName = fname+".c";
					}
					break label;
			}
		}
		new JTran().translate(fileName, C_fileName, print, gui, inspect);
	}

	public void translate(String fileName, String C_fileName,
						  boolean print, boolean gui, boolean inspect)
			throws IOException
	{
		String C_code = translate(fileName, C_fileName, gui, inspect);
		org.antlr.v4.runtime.misc.Utils.writeFile(C_fileName, C_code);

		if ( print ) System.out.println(C_code);
	}

	public String translate(String fileName, String C_fileName,
							boolean gui, boolean inspect)
			throws IOException
	{
		ANTLRInputStream input = new ANTLRFileStream(fileName);
		JLexer l = new JLexer(input);
		TokenStream tokens = new CommonTokenStream(l);

		JParser parser = new JParser(tokens);
//		parser.addErrorListener(new DiagnosticErrorListener());
		ParserRuleContext tree = parser.file();

		DefineScopesAndSymbols def = new DefineScopesAndSymbols(globals);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(def, tree);

		ComputeTypes computeTypes = new ComputeTypes(globals);
		walker = new ParseTreeWalker();
		walker.walk(computeTypes, tree);

		CodeGenerator gen = new CodeGenerator(C_fileName);
		CFile file = gen.generate(tree);

		ModelConverter converter = new ModelConverter(gen.templates);
		ST fileST = converter.walk(file);

		String C_code = fileST.render();

		if ( gui ) Trees.inspect(tree, parser);

		if ( inspect ) fileST.inspect(); // very useful; pulls up ST debugger

		return C_code;
	}
}
