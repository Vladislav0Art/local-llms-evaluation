package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAssignExprTest {

    @Test
    public void assignExprTest() {
        AssingExpr expr = new AssingExpr("var1", new VarExpr("values"));
        String expectedOutput = "var1 = values";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}