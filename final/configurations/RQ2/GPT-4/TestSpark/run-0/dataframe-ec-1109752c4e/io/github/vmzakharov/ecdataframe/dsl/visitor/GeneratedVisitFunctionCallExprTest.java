package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = mock(FunctionCallExpr.class);
        Printer mockPrinter = mock(Printer.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(mockPrinter);

        printerVisitor.visitFunctionCallExpr(expr);
        verify(mockPrinter).append("(");
        verify(mockPrinter).append(")");
    }

}