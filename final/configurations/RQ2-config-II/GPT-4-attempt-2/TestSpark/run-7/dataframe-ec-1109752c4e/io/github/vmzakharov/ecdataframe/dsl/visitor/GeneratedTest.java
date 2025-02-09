package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expr = mock(Expression.class);
        Assert.assertNotNull(PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = mock(AssingExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitAssignExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitBinaryExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = mock(UnaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitUnaryExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitConstExprTest() {
        Value expr = mock(Value.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitConstExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = mock(FunctionCallExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitFunctionCallExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = mock(PropertyPathExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitPropertyPathExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = mock(AnonymousScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitAnonymousScriptExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = mock(FunctionScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitFunctionScriptExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript expr = mock(StatementSequenceScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitStatementSequenceScript(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitVarExprTest() {
        VarExpr expr = mock(VarExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitVarExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr expr = mock(ProjectionExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitProjectionExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr expr = mock(AliasExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitAliasExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr expr = mock(VectorExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitVectorExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr expr = mock(IndexExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitIndexExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = mock(DecimalExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitDecimalExpr(expr);
        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr expr = mock(IfElseExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitIfElseExpr(expr);
        Assert.assertNotNull(visitor);
    }

}