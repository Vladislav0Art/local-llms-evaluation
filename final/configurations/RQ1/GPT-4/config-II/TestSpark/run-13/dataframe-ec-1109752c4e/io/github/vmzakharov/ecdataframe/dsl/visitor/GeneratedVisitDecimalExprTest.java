package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr mockExpr = Mockito.mock(DecimalExpr.class);
        Mockito.when(mockExpr.unscaledValueExpr()).thenReturn(new DecimalExpr(new BigInteger("10"), 2));
        Mockito.when(mockExpr.scaleExpr()).thenReturn(new DecimalExpr(new BigInteger("20"), 2));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitDecimalExpr(mockExpr);

        Assert.assertEquals("[10,20]", printer.toString().trim());
    }

}