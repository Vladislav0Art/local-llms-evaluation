package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        StringValue mockExpr = Mockito.mock(StringValue.class);
        Mockito.when(mockExpr.asStringLiteral()).thenReturn("\"test\"");

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitConstExpr(mockExpr);

        Assert.assertEquals("\"test\"", printer.toString().trim());
    }

}