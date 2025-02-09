package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr expr = Mockito.mock(IfElseExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIfElseExpr(expr);
    }

}