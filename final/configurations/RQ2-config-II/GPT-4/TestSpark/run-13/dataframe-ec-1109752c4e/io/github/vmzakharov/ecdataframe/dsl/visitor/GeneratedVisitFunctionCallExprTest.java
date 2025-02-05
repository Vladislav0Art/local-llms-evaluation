package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        FunctionCallExpr mockExpr = Mockito.mock(FunctionCallExpr.class);
        new PrettyPrintVisitor(mockPrinter).visitFunctionCallExpr(mockExpr);
        Mockito.verify(mockPrinter).print(Mockito.anyString());
    }

}