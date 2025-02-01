package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringWhenBinaryExprTest {

    @Test
    public void exprToStringWhenBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new DecimalExpr(new DecimalValue(BigDecimal.TEN)), BinaryOp.ADD,
                new DecimalExpr(new DecimalValue(BigDecimal.TEN)));
        Assert.assertEquals("(10 + 10)", PrettyPrintVisitor.exprToString(binaryExpr));
    }

}