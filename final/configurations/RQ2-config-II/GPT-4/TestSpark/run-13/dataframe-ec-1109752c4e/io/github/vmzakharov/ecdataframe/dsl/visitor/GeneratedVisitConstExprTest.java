package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        Value mockExpr = Mockito.mock(Value.class);
        new PrettyPrintVisitor(mockPrinter).visitConstExpr(mockExpr);
        Mockito.verify(mockPrinter).print(Mockito.anyString());
    }

}