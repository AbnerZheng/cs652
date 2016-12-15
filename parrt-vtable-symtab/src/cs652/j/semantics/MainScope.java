package cs652.j.semantics;

import org.antlr.symtab.BaseScope;
import org.antlr.symtab.Scope;

/**
 * Created by abnerzheng on 2016/12/9.
 */
public class MainScope extends BaseScope {
    public MainScope(Scope enclosingScope) {
        super(enclosingScope);
    }
    @Override
    public String getName() {
        return "main";
    }
}
