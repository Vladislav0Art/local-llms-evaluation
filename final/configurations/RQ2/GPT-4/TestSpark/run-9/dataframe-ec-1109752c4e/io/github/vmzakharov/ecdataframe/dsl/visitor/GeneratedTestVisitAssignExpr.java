package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        Printer printer = PrinterFactory.newCollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        AssingExpr assingExpr = Mockito.mock(AssingExpr.class);
        prettyPrintVisitor.visitAssignExpr(assingExpr);

        Assert.assertEquals("", printer.asString());
    }

}