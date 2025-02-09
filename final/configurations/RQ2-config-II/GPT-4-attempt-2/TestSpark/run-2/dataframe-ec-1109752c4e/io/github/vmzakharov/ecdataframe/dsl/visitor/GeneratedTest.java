package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression e = Mockito.mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(e);
        // Check something about the result based on your requirements/implementation
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = Mockito.mock(AssingExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitConstExprTest() {
        Value expr = Mockito.mock(Value.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = Mockito.mock(FunctionCallExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = Mockito.mock(PropertyPathExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitPropertyPathExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = Mockito.mock(AnonymousScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAnonymousScriptExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = Mockito.mock(FunctionScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionScriptExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript expr = Mockito.mock(StatementSequenceScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitStatementSequenceScript(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitVarExprTest() {
        VarExpr expr = Mockito.mock(VarExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVarExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr expr = Mockito.mock(ProjectionExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitProjectionExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr expr = Mockito.mock(AliasExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAliasExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr expr = Mockito.mock(VectorExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVectorExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr expr = Mockito.mock(IndexExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIndexExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = Mockito.mock(DecimalExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitDecimalExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr expr = Mockito.mock(IfElseExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitIfElseExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

}