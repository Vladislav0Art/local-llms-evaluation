package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.StringExpression;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        AnonymousScript expr = Mockito.mock(AnonymousScript.class);
        String result = PrettyPrintVisitor.exprToString(expr);
        assertEquals("", result);
    }

    @Test
    public void visitStringExpressionTest() {
        Printer printer = new CollectingPrinter();
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        StringExpression expr = new StringExpression("test");
        prettyPrintVisitor.visitConstExpr(expr);
        assertEquals("'test'", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        Printer printer = new CollectingPrinter();
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new StringExpression("test"));
        prettyPrintVisitor.visitUnaryExpr(expr);
        assertEquals("!('test')", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        Printer printer = new CollectingPrinter();
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new StringExpression("test1"), BinaryOp.EQ, new StringExpression("test2"));
        prettyPrintVisitor.visitBinaryExpr(expr);
        assertEquals("('test1') == ('test2')", printer.toString());
    }

    @Test
    public void visitAssignExpr() {
        Printer printer = new CollectingPrinter();
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        AssignExpr assignExpr = new AssignExpr("var", false, new StringExpression("test"));
        prettyPrintVisitor.visitAssignExpr(assignExpr);
        assertEquals("var = 'test'", printer.toString());
    }

}