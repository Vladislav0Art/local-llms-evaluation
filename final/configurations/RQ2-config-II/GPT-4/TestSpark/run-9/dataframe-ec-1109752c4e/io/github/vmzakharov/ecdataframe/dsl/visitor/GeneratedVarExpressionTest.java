package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVarExpressionTest {

    @Test
    public void varExpressionTest() {
        VarExpr expr = new VarExpr("var1");
        String expectedOutput = "var1";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}