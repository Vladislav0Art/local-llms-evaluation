package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = new BinaryExpr(Operation.ADDITION, new ConstExpr(1), new ConstExpr(2));
        String res = PrettyPrintVisitor.exprToString(e);

        Assert.assertEquals("1 + 2", res);
    }

}