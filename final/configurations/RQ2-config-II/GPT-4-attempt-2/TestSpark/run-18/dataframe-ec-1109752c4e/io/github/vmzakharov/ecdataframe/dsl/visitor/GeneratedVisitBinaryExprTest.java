package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr binaryExpr = new BinaryExpr(null, BinaryOp.MINUS, null);
        visitor.visitBinaryExpr(binaryExpr);
        Assert.assertEquals("Null - Null", printer.asString());
    }

}