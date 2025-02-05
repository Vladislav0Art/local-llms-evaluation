package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(collectingPrinter);
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NOT, new VarExpr(null, "a"));
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        String expected = "a.not";
        assertEquals(expected, collectingPrinter.getBuffer());
    }

}