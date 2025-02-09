package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        ProjectionExpr projectionExpr = new ProjectionExpr(new VarExpr("num"));
        projectionExpr.accept(visitor);
    }

}