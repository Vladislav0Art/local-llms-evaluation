package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneratedVisitUnaryExprPrefixTest {

    @Test
    public void visitUnaryExprPrefixTest() {
        UnaryExpr mockExpr = Mockito.mock(UnaryExpr.class);
        Mockito.when(mockExpr.getOperation()).thenReturn(UnaryExpr.Operation.NOT);
        Mockito.when(mockExpr.getOperand()).thenReturn(new BooleanValue(false));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitUnaryExpr(mockExpr);

        Assert.assertEquals("!" + "(" + "F" + ")", printer.toString().trim());
    }

}