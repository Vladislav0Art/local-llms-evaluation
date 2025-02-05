package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedProjectionExpressionTest {

    @Test
    public void projectionExpressionTest() {
        ProjectionExpr expr = new ProjectionExpr(new VarExpr("var1"), new VarExpr("var2"));
        String expectedOutput = "var1[var2]";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}