package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitAssignExpr_SimpleAssign {

    @Test
    public void testVisitAssignExpr_SimpleAssign() {
        AssingExpr expr = new AssingExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
    }

}