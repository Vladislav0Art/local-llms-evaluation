package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static io.github.vmzakharov.ecdataframe.dsl.ExpressionParser.*;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expression = toExpression("a + 1");
        Assert.assertEquals("(a + 1)", PrettyPrintVisitor.exprToString(expression));
    }

    @Test
    public void visitAssignExprTest() {
        Expression expression = toAssignmentExpression("a = 1");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("a = 1", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        Expression expression = toExpression("5 * 3");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("(5 * 3)", printer.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        Expression expression = toUnaryExpression("-5");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("- (5)", printer.toString());
    }

    @Test
    public void visitConstExprTest() {
        Expression expression = toConstantExpression("5");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("5", printer.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        Expression expression = toFunctionCallExpression("sum(a, b)");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("sum(a, b)", printer.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        Expression expression = toPropertyPathExpression("object.property");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("object.property", printer.toString());
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        MutableList<Expression> expressions = Lists.mutable.of(toExpression("2 + 2"), toExpression("1 + 1"));
        AnonymousScript anonymousScript = new AnonymousScript(expressions);
        CollectingPrinter printer = new CollectingPrinter();
        anonymousScript.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("(2 + 2)\n(1 + 1)\n", printer.toString());
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr("alias", toFunctionCallExpression("sum(a, b)"));
        CollectingPrinter printer = new CollectingPrinter();
        aliasExpr.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("alias : sum(a, b)", printer.toString());
    }

}