package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        VarExpr varExpr = new VarExpr("VarName");
        visitor.visitVarExpr(varExpr);
        Assert.assertEquals("VarName", printer.asString());
    }

}