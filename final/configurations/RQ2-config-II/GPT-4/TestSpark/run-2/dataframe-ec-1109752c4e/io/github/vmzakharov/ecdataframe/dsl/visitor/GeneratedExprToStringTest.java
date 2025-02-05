package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, BinaryOp.ADD, new VarExpr(null, "a"), new VarExpr(null, "b"));
        String expected = "a + b";
        assertEquals(expected, PrettyPrintVisitor.exprToString(binaryExpr));
    }

}