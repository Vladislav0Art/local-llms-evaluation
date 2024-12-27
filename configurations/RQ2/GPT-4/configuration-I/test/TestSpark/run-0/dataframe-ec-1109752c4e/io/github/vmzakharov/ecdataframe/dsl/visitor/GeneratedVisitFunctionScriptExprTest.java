package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript expr = new FunctionScript();
        visitor.visitFunctionScriptExpr(expr);
        assertEquals(FunctionScript.class, expr.getClass());
    }

}