package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = Mockito.mock(FunctionScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionScriptExpr(expr);
    }

}