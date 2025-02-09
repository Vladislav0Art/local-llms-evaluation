package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        ProjectionExpr expression = Mockito.mock(ProjectionExpr.class);

        new PrettyPrintVisitor(printer).visitProjectionExpr(expression);

        Mockito.verify(printer).print(expression.toString());
    }

}