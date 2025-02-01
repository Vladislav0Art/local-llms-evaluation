package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringWhenUnaryExprTest {

    @Test
    public void exprToStringWhenUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, new DecimalExpr(new DecimalValue(BigDecimal.TEN)));
        Assert.assertEquals("!10.0", PrettyPrintVisitor.exprToString(unaryExpr));
    }

}