package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        visitor.visitBinaryExpr(expr);
        Mockito.verify(printer, Mockito.times(1)).stringValueOf(expr);
    }

}