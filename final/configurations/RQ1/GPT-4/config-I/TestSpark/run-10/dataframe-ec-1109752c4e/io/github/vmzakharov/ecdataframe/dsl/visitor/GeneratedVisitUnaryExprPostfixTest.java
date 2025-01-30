package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprPostfixTest {

    // Test visitAssignExpr method

    @Test
    public void visitUnaryExprPostfixTest() {
        CollectingPrinter mockPrinter = Mockito.mock(CollectingPrinter.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        Expression operand = new ValueExpr(new StringValue("operand"));
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.DECREMENT, operand, false);
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        Mockito.verify(mockPrinter, Mockito.times(5)).print(Mockito.anyString());
    }

}