package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PropertyPathExpr expression = Mockito.mock(PropertyPathExpr.class);

        new PrettyPrintVisitor(printer).visitPropertyPathExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}