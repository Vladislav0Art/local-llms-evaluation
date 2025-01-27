package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void exprToString_EmptyExpression_ReturnsEmptyString() {
        Expression e = new Expression();
        String result = PrettyPrintVisitor.exprToString(e);
        assertThat(result, is(""));
    }

    @Test
    public void exprToString_ConstExpr_ReturnsConstExprValue() {
        Value value = new Value("10");
        Expression e = new ConstExpr(value);
        String result = PrettyPrintVisitor.exprToString(e);
        assertThat(result, is("\"10\""));
    }

    @Test
    public void visitAssignExpr_SimpleAssignment_ReturnsSimpleAssignment() {
        AssigningExpr expr = new AssigningExpr(new VarExpr("a"), 1);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertThat(result, is("\"a\" := 1"));
    }

    @Test
    public void visitAssignExpr_MultipleAssignments_ReturnsMultipleAssignments() {
        AssigningExpr expr1 = new AssigningExpr(new VarExpr("x"), 1);
        AssigningExpr expr2 = new AssigningExpr(new VarExpr("y"), 2);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(new ListIterable<>(new ArrayList[]{expr1, expr2})).toString();
        assertThat(result, is("\"x\" := 1\ny := 2"));
    }

    @Test
    public void visitBinaryExpr_SimpleBinaryOperation_ReturnsSimpleBinaryOperation() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), Operator.ADD, new ConstExpr(5));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertThat(result, is("\"a\" + 5"));
    }

    @Test
    public void visitBinaryExpr_NestedBinaryOperation_ReturnsNestedBinaryOperation() {
        BinaryExpr expr1 = new BinaryExpr(new VarExpr("x"), Operator.ADD, new ConstExpr(2));
        BinaryExpr expr2 = new BinaryExpr(expr1, Operator.ADD, new ConstExpr(3));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(new ListIterable<>(new ArrayList[]{expr1, expr2})).toString();
        assertThat(result, is("\"x\" + 2 + 3"));
    }

}