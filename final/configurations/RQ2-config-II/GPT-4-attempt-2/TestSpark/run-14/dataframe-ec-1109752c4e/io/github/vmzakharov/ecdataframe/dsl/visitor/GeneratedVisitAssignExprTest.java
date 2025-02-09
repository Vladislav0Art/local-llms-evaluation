package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = Mockito.mock(AssingExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
    }

}