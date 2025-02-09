package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);
        assertEquals("", PrettyPrintVisitor.exprToString(expression));
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = Mockito.mock(AssingExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);
    }

    @Test
    public void visitConstExprTest() {
        Value expr = Mockito.mock(Value.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(expr);
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = Mockito.mock(FunctionCallExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = Mockito.mock(PropertyPathExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitPropertyPathExpr(expr);
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = Mockito.mock(AnonymousScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAnonymousScriptExpr(expr);
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = Mockito.mock(FunctionScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionScriptExpr(expr);
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript expr = Mockito.mock(StatementSequenceScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitStatementSequenceScript(expr);
    }

    @Test
    public void visitVarExprTest() {
        VarExpr expr = Mockito.mock(VarExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVarExpr(expr);
    }

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr expr = Mockito.mock(ProjectionExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitProjectionExpr(expr);
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr expr = Mockito.mock(AliasExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAliasExpr(expr);
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr expr = Mockito.mock(VectorExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVectorExpr(expr);
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr expr = Mockito.mock(IndexExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIndexExpr(expr);
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = Mockito.mock(DecimalExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitDecimalExpr(expr);
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr expr = Mockito.mock(IfElseExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIfElseExpr(expr);
    }

}