package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        AssingExpr expression = Mockito.mock(AssingExpr.class);

        new PrettyPrintVisitor(printer).visitAssignExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}