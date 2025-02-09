package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        Value expr = Mockito.mock(Value.class);
        visitor.visitConstExpr(expr);
        Mockito.verify(printer, Mockito.times(1)).stringValueOf(expr);
    }

}