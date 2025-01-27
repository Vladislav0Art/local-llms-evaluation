package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitProjectionExpr_Projection {

    @Test
    public void testVisitProjectionExpr_Projection() {
        ProjectionExpr expr = new ProjectionExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitProjectionExpr(expr);
    }

}