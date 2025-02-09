package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        IfElseExpr ifElseExpr = new IfElseExpr(
                new BinaryExpr(new DecimalExpr(5), Operator.EQ, new DecimalExpr(10)),
                new DecimalExpr(20),
                new DecimalExpr(30));
        ifElseExpr.accept(visitor);
    }

}