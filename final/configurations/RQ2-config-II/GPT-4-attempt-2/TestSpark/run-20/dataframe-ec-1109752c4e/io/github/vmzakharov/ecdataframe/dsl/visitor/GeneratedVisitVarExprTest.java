package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        VarExpr expression = Mockito.mock(VarExpr.class);

        new PrettyPrintVisitor(printer).visitVarExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}