package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assingExpr = Mockito.mock(AssingExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitAssignExpr(assingExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = Mockito.mock(BinaryExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitBinaryExpr(binaryExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = Mockito.mock(UnaryExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitUnaryExpr(unaryExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(expression);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = Mockito.mock(FunctionCallExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitFunctionCallExpr(functionCallExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = Mockito.mock(VarExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitVarExpr(varExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = Mockito.mock(AliasExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitAliasExpr(aliasExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = Mockito.mock(VectorExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitVectorExpr(vectorExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = Mockito.mock(IfElseExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitIfElseExpr(ifElseExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}