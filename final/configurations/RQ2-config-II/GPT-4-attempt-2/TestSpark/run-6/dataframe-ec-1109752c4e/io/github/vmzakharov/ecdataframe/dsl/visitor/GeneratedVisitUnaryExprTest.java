package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        Printer printer = PrinterFactory.systemOutPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);
        visitor.visitUnaryExpr(expr);

        Mockito.verify(expr, Mockito.times(1)).accept(visitor);
    }

}