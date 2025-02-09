package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("var1"), new VarExpr("var2"), BinaryOp.PLUS);
        assertEquals("var1 + var2", PrettyPrintVisitor.exprToString(binaryExpr));
    }

}