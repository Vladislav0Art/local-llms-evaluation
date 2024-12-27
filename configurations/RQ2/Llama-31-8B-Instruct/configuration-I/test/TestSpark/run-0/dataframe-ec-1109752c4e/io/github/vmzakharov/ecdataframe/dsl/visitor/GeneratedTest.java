package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void constructorTest_NoArgs() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        assertNotNull(visitor);
    }

    @Test
    public void constructorTest_WithPrinter() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(null);
        assertNotNull(visitor);
    }

    @Test
    public void exprToStringTest_Null() {
        assertEquals("", PrettyPrintVisitor.exprToString(null));
    }

    @Test
    public void exprToStringTest_Expression() {
        Expression expression = new Expression();
        assertEquals("", PrettyPrintVisitor.exprToString(expression));
    }

    @Test
    public void visitAssignExprTest_Null() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(null);
    }

    @Test
    public void visitAssignExprTest_AssignExpr() {
        AssignExpr assignExpr = new AssignExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(assignExpr);
    }

    @Test
    public void visitBinaryExprTest_Null() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(null);
    }

    @Test
    public void visitBinaryExprTest_BinaryExpr() {
        BinaryExpr binaryExpr = new BinaryExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(binaryExpr);
    }

    @Test
    public void visitUnaryExprTest_Null() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(null);
    }

    @Test
    public void visitUnaryExprTest_UnaryExpr() {
        UnaryExpr unaryExpr = new UnaryExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(unaryExpr);
    }

    @Test
    public void visitConstExprTest_Null() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(null);
    }

}