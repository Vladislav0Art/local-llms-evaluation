package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        VectorExpr expr = Mockito.mock(VectorExpr.class);
        visitor.visitVectorExpr(expr);
        Mockito.verify(printer, Mockito.times(1)).stringValueOf(expr);
    }

}