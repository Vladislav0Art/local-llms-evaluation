package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(collectingPrinter);
        AssingExpr assingExpr = new AssingExpr(null, "a", new VarExpr(null, "b"));
        prettyPrintVisitor.visitAssignExpr(assingExpr);
        String expected = "a := b";
        assertEquals(expected, collectingPrinter.getBuffer());
    }

}