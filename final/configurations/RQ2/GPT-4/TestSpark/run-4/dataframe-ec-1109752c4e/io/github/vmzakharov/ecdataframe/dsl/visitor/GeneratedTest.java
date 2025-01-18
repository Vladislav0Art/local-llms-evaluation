package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        StringValue value = new StringValue("value");
        String result = PrettyPrintVisitor.exprToString(value);
        Assert.assertEquals("'value'", result);
    }

    @Test
    public void visitConstExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        StringValue value = new StringValue("value");

        visitor.visitConstExpr(value);
        Mockito.verify(printer).print("'value'");
    }

    @Test
    public void visitUnaryExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new VarExpr("variable", false));

        visitor.visitUnaryExpr(expr);
        Mockito.verify(printer).print("! variable");
    }

    @Test
    public void visitAssignExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = new AssingExpr("variable", false, new StringValue("value"));

        visitor.visitAssignExpr(expr);
        Mockito.verify(printer).print("variable = 'value'");
    }

}