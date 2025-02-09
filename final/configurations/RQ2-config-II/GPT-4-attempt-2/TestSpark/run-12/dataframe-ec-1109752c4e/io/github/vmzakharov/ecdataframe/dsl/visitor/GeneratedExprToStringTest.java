package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = new AliasExpr(new VarExpr("var1"), "alias1");
        String result = PrettyPrintVisitor.exprToString(e);
        // Assumed expected string
        assertEquals("var1 as alias1", result);
    }

}