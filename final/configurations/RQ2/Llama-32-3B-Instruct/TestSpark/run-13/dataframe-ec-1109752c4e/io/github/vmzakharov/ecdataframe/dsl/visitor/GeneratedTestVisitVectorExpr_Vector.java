package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitVectorExpr_Vector {

    @Test
    public void testVisitVectorExpr_Vector() {
        VectorExpr expr = new VectorExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVectorExpr(expr);
    }

}