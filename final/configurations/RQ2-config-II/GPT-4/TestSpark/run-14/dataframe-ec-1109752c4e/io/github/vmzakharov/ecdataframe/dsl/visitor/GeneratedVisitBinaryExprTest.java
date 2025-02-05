package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binary = new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(1));
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        ppvisitor.visitBinaryExpr(binary);

        assertEquals("x + 1.0", printer.toString());
    }

}