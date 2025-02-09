package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        FunctionCallExpr expression = Mockito.mock(FunctionCallExpr.class);

        new PrettyPrintVisitor(printer).visitFunctionCallExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}