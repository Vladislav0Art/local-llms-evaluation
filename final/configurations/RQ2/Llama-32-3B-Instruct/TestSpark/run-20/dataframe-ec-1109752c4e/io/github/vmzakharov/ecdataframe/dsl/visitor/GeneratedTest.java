package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void exprToStringExpressionTest() {
        Expression expression = new Expression();
        String result = PrettyPrintVisitor.exprToString(expression);
        assertThat(result, is("Expression"));
    }

    @Test
    public void exprToStringAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr(new Expression());
        String result = PrettyPrintVisitor.exprToString(aliasExpr);
        assertThat(result, is("Alias(Expression)"));
    }

    @Test
    public void visitAssignExprReturnStatementWithAssignmentTest() {
        AssingExpr assignExpr = new AssingExpr(new Expression(), new Expression());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Printer printer = new CollectingPrinter(outContent);
        visitor.visit(assignExpr, printer);
        String result = outContent.toString();
        assertThat(result, is("result = Expression"));
    }

    @Test
    public void visitAssignExprAssignmentWithoutResultTest() {
        AssingExpr assignExpr = new AssingExpr(new Expression());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Printer printer = new CollectingPrinter(outContent);
        visitor.visit(assignExpr, printer);
        String result = outContent.toString();
        assertThat(result, is("Expression"));
    }

    @Test
    public void visitBinaryExprReturnStatementWithAssignmentTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new Expression(), Operator.ADD, new Expression());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Printer printer = new CollectingPrinter(outContent);
        visitor.visit(binaryExpr, printer);
        String result = outContent.toString();
        assertThat(result, is("result = Expression + Expression"));
    }

    @Test
    public void visitBinaryExprAssignmentWithoutResultTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new Expression(), Operator.ADD);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Printer printer = new CollectingPrinter(outContent);
        visitor.visit(binaryExpr, printer);
        String result = outContent.toString();
        assertThat(result, is("Expression"));
    }

}