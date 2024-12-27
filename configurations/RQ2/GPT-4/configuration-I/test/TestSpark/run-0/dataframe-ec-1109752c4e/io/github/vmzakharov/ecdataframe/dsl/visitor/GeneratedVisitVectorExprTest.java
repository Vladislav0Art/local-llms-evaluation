package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr expr = new VectorExpr();
        visitor.visitVectorExpr(expr);
        assertEquals(VectorExpr.class, expr.getClass());
    }

}