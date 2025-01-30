package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.IfElseExpr;
import io.github.vmzakharov.ecdataframe.dsl.IndexExpr;
import io.github.vmzakharov.ecdataframe.dsl.ProjectionExpr;
import io.github.vmzakharov.ecdataframe.dsl.PropertyPathExpr;
import io.github.vmzakharov.ecdataframe.dsl.StatementSequenceScript;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.VectorExpr;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = Mockito.mock(AssingExpr.class);
        Mockito.when(expr.getVarName()).thenReturn("x");
        Expression right = Mockito.mock(Expression.class);

        Mockito.when(expr.getExpression()).thenReturn(right);
        Mockito.when(expr.isEscaped()).thenReturn(false);

        assertEquals("x = ", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        Expression left = Mockito.mock(Expression.class);
        Expression right = Mockito.mock(Expression.class);

        Mockito.when(expr.getOperand1()).thenReturn(left);
        Mockito.when(expr.getOperand2()).thenReturn(right);

        assertEquals("( )", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);
        Expression operand = Mockito.mock(Expression.class);

        Mockito.when(expr.getOperand()).thenReturn(operand);

        assertEquals("( )", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitConstExprTest() {
        Value expr = Mockito.mock(Value.class);
        Mockito.when(expr.asStringLiteral()).thenReturn("100");

        assertEquals("100", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitFunctionCallExprTest() {
        // To be implemented...
    }

}