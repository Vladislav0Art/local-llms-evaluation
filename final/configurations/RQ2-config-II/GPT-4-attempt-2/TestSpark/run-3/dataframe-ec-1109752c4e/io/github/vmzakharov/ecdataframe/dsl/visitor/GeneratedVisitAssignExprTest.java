package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        AssingExpr assingExpr = new AssingExpr(new VarExpr("num"), new DecimalExpr(10));
        assingExpr.accept(visitor);
    }

}