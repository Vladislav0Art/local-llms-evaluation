package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionScriptExpr_FunctionScriptExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitFunctionScriptExpr_FunctionScriptExpression_PassesCorrectly() {
        FunctionScript functionScript = new FunctionScript("function(a) { return a; }");
        prettyPrintVisitor.visitFunctionScriptExpr(functionScript);
    }

}