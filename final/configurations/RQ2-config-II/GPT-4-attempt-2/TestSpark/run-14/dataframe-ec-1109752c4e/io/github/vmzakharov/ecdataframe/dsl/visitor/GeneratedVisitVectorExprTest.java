package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr expr = Mockito.mock(VectorExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVectorExpr(expr);
    }

}