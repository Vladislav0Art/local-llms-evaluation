package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, null);
        visitor.visitUnaryExpr(unaryExpr);
        Assert.assertEquals("!Null", printer.asString());
    }

}