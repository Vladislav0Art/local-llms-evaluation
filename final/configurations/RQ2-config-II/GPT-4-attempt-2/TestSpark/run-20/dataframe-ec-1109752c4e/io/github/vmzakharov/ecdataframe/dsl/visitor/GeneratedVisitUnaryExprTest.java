package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        UnaryExpr expression = Mockito.mock(UnaryExpr.class);

        new PrettyPrintVisitor(printer).visitUnaryExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}