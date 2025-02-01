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

public class GeneratedVisitUnaryExprTest_postfix {

    @Test
    public void visitUnaryExprTest_postfix() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.FACT, new DecimalValue(3));
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        verify(mockPrinter).print("(3) !");
    }

}