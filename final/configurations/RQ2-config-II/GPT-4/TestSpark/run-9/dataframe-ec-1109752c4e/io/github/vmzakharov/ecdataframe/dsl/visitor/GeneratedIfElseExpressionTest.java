package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIfElseExpressionTest {

    @Test
    public void ifElseExpressionTest() {
        IfElseExpr expr = new IfElseExpr(new VarExpr("cond1"), new VarExpr("var1"), new VarExpr("var2"));
        String expectedOutput = "(cond1 ? var1 : var2)";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}