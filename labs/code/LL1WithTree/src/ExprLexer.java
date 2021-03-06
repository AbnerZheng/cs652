import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/** Match tokens from the grammar + * ( ) and
 ID  : [a-z]+ ;
 INT : [0-9]+ ;
 WS  : [ \r\t\n]+ -> skip ;
 */
public class ExprLexer extends Lexer {
	public static final int ID = 1;
	public static final int INT = 2;
	public static final int PLUS = 3;
	public static final int MULT = 4;
	public static final int LPAREN = 5;
	public static final int RPAREN = 6;

	public ExprLexer(Reader reader) throws IOException {
		super(reader);
	}

	@Override
	public Token nextToken() throws IOException {
		text.setLength(0); // reset text
		int type = Token.INVALID_TYPE;
        matchID();


		if ( type==Token.INVALID_TYPE ) {
			System.err.println("illegal char: "+(char)c);
			consume();
			// try again (tail recursion is like a loop)
			return nextToken();
		}
		return new Token(type, text.toString());
	}

	protected int matchINT() throws IOException {
	}

	protected int matchID() throws IOException {
	}

	public static void main(String[] args) throws IOException {
		readAndPrint(new ExprLexer(new InputStreamReader(System.in)));
	}
}
