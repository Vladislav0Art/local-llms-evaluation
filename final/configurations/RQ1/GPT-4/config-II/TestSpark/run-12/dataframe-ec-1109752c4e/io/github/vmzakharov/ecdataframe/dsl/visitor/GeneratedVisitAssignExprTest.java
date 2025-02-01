package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        AssingExpr assingExpr = new AssingExpr(new Reference(), "x", new StringValue("Test String"), false);
        prettyPrintVisitor.visitAssignExpr(assingExpr);
        verify(mockPrinter).print("x = ");
    }

}