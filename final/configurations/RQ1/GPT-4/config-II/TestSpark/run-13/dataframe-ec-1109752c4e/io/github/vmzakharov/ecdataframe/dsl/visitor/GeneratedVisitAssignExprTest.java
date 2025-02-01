package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr mockExpr = Mockito.mock(AssingExpr.class);
        Mockito.when(mockExpr.getVarName()).thenReturn("testVar");
        Mockito.when(mockExpr.isEscaped()).thenReturn(false);
        Mockito.when(mockExpr.getExpression()).thenReturn(new DecimalExpr(new BigInteger("10"), 2));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAssignExpr(mockExpr);

        Assert.assertEquals("testVar = 10", printer.toString().trim());
    }

}