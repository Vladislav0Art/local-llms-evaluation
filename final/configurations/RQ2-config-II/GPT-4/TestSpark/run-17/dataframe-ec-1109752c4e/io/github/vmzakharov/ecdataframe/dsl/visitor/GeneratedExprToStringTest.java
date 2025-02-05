package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        VarExpr varExpr = new VarExpr(null, "varExprTest");
        Assert.assertEquals("varExprTest", PrettyPrintVisitor.exprToString(varExpr));
    }

}