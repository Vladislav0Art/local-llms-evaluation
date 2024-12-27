package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr expr = new DecimalExpr();
        visitor.visitDecimalExpr(expr);
        assertEquals(DecimalExpr.class, expr.getClass());
    }

}