package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedFunctionCallExpressionTest {

    @Test
    public void functionCallExpressionTest() {
        FunctionCallExpr expr = new FunctionCallExpr(new VarExpr("func1"), new VarExpr("var1"));
        String expectedOutput = "func1(var1)";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}