package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.getDefaultPrinter());
        VectorExpr vectorExpr = new VectorExpr();
        vectorExpr.accept(visitor);
    }

}