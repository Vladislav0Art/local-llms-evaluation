package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitUnaryExpr_NegativeNumber {

    @Test
    public void testVisitUnaryExpr_NegativeNumber() {
        UnaryExpr expr = new UnaryExpr("-");
        Value value = Mockito.mock(Value.class);
        expr.setExpression(value);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);
    }

}