package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        expression.accept(visitor);

        Assert.assertNotNull(visitor.toString());
    }

    @Test
    public void visitAssignExprTest() {
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr assingExpr = Mockito.mock(AssingExpr.class);

        visitor.visitAssignExpr(assingExpr);
        Assert.assertEquals("", printer.toString());
    }

}