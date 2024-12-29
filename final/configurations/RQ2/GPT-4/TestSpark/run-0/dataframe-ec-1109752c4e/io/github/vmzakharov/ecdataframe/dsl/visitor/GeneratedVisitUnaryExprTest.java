package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = mock(UnaryExpr.class);
        Printer mockPrinter = mock(Printer.class);
        PrettyPrintVisitor printerVisitor = new PrettyPrintVisitor(mockPrinter);

        printerVisitor.visitUnaryExpr(expr);
        verify(expr).getOperand();
    }

}