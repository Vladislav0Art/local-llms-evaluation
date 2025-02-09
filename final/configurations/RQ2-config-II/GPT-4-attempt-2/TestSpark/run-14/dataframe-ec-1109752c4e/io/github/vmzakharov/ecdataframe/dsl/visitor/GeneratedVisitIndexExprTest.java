package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr expr = Mockito.mock(IndexExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIndexExpr(expr);
    }

}