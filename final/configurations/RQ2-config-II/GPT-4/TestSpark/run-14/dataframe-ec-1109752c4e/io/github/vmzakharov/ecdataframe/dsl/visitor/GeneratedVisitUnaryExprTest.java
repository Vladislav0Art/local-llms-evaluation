package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unary = new UnaryExpr("-", new DecimalExpr(1));
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor(printer);
        ppvisitor.visitUnaryExpr(unary);

        assertEquals("-1.0", printer.toString());
    }

}