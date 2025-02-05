package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAliasExpressionTest {

    @Test
    public void aliasExpressionTest() {
        AliasExpr expr = new AliasExpr(new VarExpr("var1"), "alias1");
        String expectedOutput = "(var1 as alias1)";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}