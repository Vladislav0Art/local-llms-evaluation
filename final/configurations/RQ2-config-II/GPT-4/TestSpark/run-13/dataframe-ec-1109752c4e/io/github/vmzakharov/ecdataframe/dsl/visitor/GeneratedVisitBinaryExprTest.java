package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        BinaryExpr mockExpr = Mockito.mock(BinaryExpr.class);
        new PrettyPrintVisitor(mockPrinter).visitBinaryExpr(mockExpr);
        Mockito.verify(mockPrinter).print(Mockito.anyString());
    }

}