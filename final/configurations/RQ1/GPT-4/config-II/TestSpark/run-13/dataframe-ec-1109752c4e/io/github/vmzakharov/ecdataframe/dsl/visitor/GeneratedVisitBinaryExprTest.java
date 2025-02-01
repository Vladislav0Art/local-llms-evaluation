package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr mockExpr = Mockito.mock(BinaryExpr.class);
        Mockito.when(mockExpr.getOperand1()).thenReturn(new DecimalExpr(new BigInteger("10"), 2));
        Mockito.when(mockExpr.getOperand2()).thenReturn(new DecimalExpr(new BigInteger("20"), 2));
        Mockito.when(mockExpr.getOperation()).thenReturn(BinaryExpr.Operation.ADD);

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitBinaryExpr(mockExpr);

        Assert.assertEquals("(10 + 20)", printer.toString().trim());
    }

}