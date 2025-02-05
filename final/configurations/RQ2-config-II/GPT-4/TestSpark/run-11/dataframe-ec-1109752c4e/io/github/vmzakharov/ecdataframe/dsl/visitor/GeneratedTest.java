package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = new AssingExpr("var", new ConstExpr("value"));
        visitor.visitAssignExpr(expr);
        Assert.assertEquals("var := value", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new VarExpr("var1"), new VarExpr("var2"), Operator.ADD);
        visitor.visitBinaryExpr(expr);
        Assert.assertEquals("var1 + var2", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        Printer printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(new VarExpr("var"), Operator.NOT);
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals("~var", printer.toString());
    }

    @Test
    public void exprToStringTest() {
        Expression expr = new VarExpr("var");
        String result = PrettyPrintVisitor.exprToString(expr);
        Assert.assertEquals("var", result);
    }

}