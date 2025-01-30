package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssignExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.Operation;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprPrefixTest {

    @Test
    public void visitUnaryExprPrefixTest() {
        Printer printer = new CollectingPrinter();
        CollectingPrinter mockPrinter = Mockito.mock(CollectingPrinter.class);
        Mockito.when(mockPrinter.print(Mockito.any())).thenReturn(printer);
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(mockPrinter);
        Expression unaryExpr = new UnaryExpr(Operation.INCREMENT, new AssignExpr("t", false, new StringValue("expr")), true);
        unaryExpr.accept(prettyPrintVisitor);
        Mockito.verify(mockPrinter, Mockito.times(5)).print(Mockito.any());
    }

}