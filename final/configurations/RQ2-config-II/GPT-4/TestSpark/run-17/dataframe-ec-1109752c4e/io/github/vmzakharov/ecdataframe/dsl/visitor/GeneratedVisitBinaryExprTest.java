package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, new DecimalExpr(null, new BigDecimal(10)), BinaryOp.ADD, new DecimalExpr(null, new BigDecimal(5)));
        Assert.assertEquals("10 + 5", PrettyPrintVisitor.exprToString(binaryExpr));
    }

}