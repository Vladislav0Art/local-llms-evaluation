package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitConstExpr_UnknownValue {

    @Test
    public void testVisitConstExpr_UnknownValue() {
        Value expr = new DecimalExpr(0);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(expr);
    }

}