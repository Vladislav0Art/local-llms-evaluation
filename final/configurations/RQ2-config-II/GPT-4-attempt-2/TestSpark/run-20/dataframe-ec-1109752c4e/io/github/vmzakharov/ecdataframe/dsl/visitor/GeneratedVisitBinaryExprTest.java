package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        BinaryExpr expression = Mockito.mock(BinaryExpr.class);

        new PrettyPrintVisitor(printer).visitBinaryExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}