package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedExprToStringTest {

    private static final PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.newCollectingPrinter());

    @Test
    public void exprToStringTest() {
        String expectedResult = "a + 1";
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), BinaryOp.PLUS, new DecimalExpr(new BigDecimal(1)));
        String result = PrettyPrintVisitor.exprToString(binaryExpr);

        Assert.assertEquals(expectedResult, result);
    }

}