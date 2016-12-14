import java.io.IOException;

/** Parse according to this grammar:
 expr : term ('+' term)* ;
 term : factor ('*' factor)* ;
 factor : ID | INT | '(' expr ')' ;
 */
public class ExprParser extends Parser {
	public ExprParser(TokenSource input) throws IOException {
		super(input);
	}

	/**  expr : term ('+' term)* ; */
	public void expr() {
		term();
		while(lookahead() == ExprLexer.PLUS){
			match(ExprLexer.PLUS);
            term();
		}
	}

	/** term : factor ('*' factor)* ; */
	public void term() {
		factor();
		while(lookahead() == ExprLexer.MULT){
			match(ExprLexer.MULT);
			factor();
		}
	}

	/** factor : ID | INT | '(' expr ')' */
	public void factor() {
		switch (lookahead()){
			case ExprLexer.ID:
			    return;
			case ExprLexer.INT:
			    return;
			case ExprLexer.LPAREN:
				expr();
				match(ExprLexer.RPAREN);
                return;
		}
		match(ExprLexer.ID);
	}
}
