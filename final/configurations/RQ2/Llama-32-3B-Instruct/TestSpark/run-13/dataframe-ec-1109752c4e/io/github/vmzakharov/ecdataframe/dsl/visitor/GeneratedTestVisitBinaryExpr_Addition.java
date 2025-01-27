package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitBinaryExpr_Addition {

    @Test
    public void testVisitBinaryExpr_Addition() {
        BinaryExpr expr = new BinaryExpr("+", 1, 2);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
    }

}