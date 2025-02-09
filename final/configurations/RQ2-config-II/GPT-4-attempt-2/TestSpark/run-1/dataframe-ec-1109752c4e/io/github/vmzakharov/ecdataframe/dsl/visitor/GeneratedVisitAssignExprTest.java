package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = Mockito.mock(AssingExpr.class);
        visitor.visitAssignExpr(expr);
        Mockito.verify(printer, Mockito.times(1)).stringValueOf(expr);
    }

}