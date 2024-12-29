package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value expr = mock(Value.class);
        Printer mockPrinter = mock(Printer.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(mockPrinter);

        printerVisitor.visitConstExpr(expr);
        verify(mockPrinter).append(expr.asStringLiteral());
    }

}