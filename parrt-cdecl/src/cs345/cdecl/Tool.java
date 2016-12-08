package cs345.cdecl;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Tool {
	public static void main(String[] args) {

		System.out.println(translate("int a;"));
		System.out.println(translate("int a;"));
	}

	public static String translate(String cdeclText) {
		ANTLRInputStream input = new ANTLRInputStream(cdeclText);
		CDeclLexer lexer = new CDeclLexer(input);
		final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		CDeclParser parser = new CDeclParser(tokenStream);
		ParseTree tree = parser.declaration();
		EnglishGenerator eval = new EnglishGenerator();
		return eval.visit(tree);
	}
}
