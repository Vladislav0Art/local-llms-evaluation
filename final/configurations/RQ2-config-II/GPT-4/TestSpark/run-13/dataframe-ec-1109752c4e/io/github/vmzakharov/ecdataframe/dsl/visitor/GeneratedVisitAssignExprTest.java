package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        AssingExpr mockExpr = Mockito.mock(AssingExpr.class);
        new PrettyPrintVisitor(mockPrinter).visitAssignExpr(mockExpr);
        Mockito.verify(mockPrinter).print(Mockito.anyString());
    }

}