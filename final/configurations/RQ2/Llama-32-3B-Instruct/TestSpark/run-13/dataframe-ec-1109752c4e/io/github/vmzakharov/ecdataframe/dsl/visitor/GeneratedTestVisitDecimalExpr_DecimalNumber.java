package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitDecimalExpr_DecimalNumber {

    @Test
    public void testVisitDecimalExpr_DecimalNumber() {
        DecimalExpr expr = new DecimalExpr(0);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitDecimalExpr(expr);
    }

}