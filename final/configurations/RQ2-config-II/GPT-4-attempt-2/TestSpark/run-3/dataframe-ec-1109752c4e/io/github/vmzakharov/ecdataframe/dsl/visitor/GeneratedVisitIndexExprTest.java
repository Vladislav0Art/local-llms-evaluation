package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        IndexExpr indexExpr = new IndexExpr(new VarExpr("vec"), new DecimalExpr(5));
        indexExpr.accept(visitor);
    }

}