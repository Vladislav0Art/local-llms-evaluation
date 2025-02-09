package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr assingExpr = new AssingExpr(null, null);
        visitor.visitAssignExpr(assingExpr);
        Assert.assertEquals("Null = Null", printer.asString());
    }

}