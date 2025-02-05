package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUnaryExpressionTest {

    @Test
    public void unaryExpressionTest() {
        UnaryExpr expr = new UnaryExpr(UnaryOp.NEG, new VarExpr("var1"));
        String expectedOutput = "-var1";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}