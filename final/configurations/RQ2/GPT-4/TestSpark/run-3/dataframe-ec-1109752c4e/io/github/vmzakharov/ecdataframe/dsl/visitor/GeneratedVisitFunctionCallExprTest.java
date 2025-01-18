package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = Mockito.mock(FunctionCallExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitFunctionCallExpr(functionCallExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}