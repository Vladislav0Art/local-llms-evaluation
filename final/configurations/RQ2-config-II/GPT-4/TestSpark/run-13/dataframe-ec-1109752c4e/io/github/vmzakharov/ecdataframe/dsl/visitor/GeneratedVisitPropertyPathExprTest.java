package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PropertyPathExpr mockExpr = Mockito.mock(PropertyPathExpr.class);
        new PrettyPrintVisitor(mockPrinter).visitPropertyPathExpr(mockExpr);
        Mockito.verify(mockPrinter).print(Mockito.anyString());
    }

}