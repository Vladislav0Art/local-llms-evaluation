package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        IndexExpr expr = Mockito.mock(IndexExpr.class);
        visitor.visitIndexExpr(expr);
        Mockito.verify(printer, Mockito.times(1)).stringValueOf(expr);
    }

}