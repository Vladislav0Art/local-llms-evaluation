package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assign = new AssingExpr("x", 1);
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        ppvisitor.visitAssignExpr(assign);

        assertEquals("x = 1", printer.toString());
    }

}