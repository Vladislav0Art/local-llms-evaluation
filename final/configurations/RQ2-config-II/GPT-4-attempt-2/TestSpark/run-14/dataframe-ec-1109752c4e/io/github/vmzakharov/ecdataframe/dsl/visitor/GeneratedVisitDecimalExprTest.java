package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = Mockito.mock(DecimalExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitDecimalExpr(expr);
    }

}