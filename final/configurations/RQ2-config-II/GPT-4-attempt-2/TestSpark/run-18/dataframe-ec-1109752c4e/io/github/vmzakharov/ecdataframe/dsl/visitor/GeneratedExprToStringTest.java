package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, BinaryOp.PLUS, null);
        String result = PrettyPrintVisitor.exprToString(binaryExpr);
        Assert.assertEquals("Null + Null", result);
    }

}