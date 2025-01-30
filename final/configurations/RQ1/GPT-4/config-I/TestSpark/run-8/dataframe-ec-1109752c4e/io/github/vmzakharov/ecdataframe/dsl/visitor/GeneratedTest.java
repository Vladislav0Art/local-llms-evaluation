package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedTest {

    private String print(Expression expression) {
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        return printer.toString();
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr("variable", new ValueExpr(new DecimalValue("5")));
        Assert.assertEquals("variable = 5", print(assignExpr));
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new ValueExpr(new DecimalValue("5")), BinaryOp.ADD, new ValueExpr(new DecimalValue("3")));
        Assert.assertEquals("(5 + 3)", print(binaryExpr));
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.MINUS, new ValueExpr(new DecimalValue("5")));
        Assert.assertEquals("-(5)", print(unaryExpr));
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("produce",
                FastList.newListWith(new ValueExpr(new DecimalValue("5"))));
        Assert.assertEquals("produce(5)", print(functionCallExpr));
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr(FastList.newListWith("target", "value"));
        Assert.assertEquals("target.value", print(propertyPathExpr));
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript anonymousScript = new AnonymousScript()
                .addExpression(new ValueExpr(new DecimalValue("5")))
                .addExpression(new ValueExpr(new DecimalValue("3")));
        Assert.assertEquals("5\n3\n", print(anonymousScript));
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript functionScript = new FunctionScript("multiply",
                new AnonymousScript().addExpression(new ValueExpr(new DecimalValue("5"))));
        Assert.assertEquals("function multiply()\n{\n  5\n}\n", print(functionScript));
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript()
                .addExpression(new ValueExpr(new DecimalValue("5")))
                .addExpression(new ValueExpr(new DecimalValue("3")));
        Assert.assertEquals("5\n3\n", print(statementSequenceScript));
    }

}