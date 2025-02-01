package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = mock(FunctionCallExpr.class);
        functionCallExpr.visit(new PrettyPrintVisitor(functionCallExpr, false));
        String expectResult = "(FunctionCallExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(functionCallExpr));
    }

}