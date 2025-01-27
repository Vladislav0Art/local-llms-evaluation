package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitIndexExpr_IndexAccess {

    @Test
    public void testVisitIndexExpr_IndexAccess() {
        IndexExpr expr = new IndexExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIndexExpr(expr);
    }

}