package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVectorExpressionTest {

    @Test
    public void vectorExpressionTest() {
        VectorExpr expr = new VectorExpr();
        expr.add(new VarExpr("var1"));
        expr.add(new VarExpr("var2"));
        expr.add(new VarExpr("var3"));
        String expectedOutput = "[var1, var2, var3]";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}