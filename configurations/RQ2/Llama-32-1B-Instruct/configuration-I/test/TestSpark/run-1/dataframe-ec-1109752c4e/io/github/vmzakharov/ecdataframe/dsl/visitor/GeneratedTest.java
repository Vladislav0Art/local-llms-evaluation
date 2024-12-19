package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitAssignExpr() {
        Expression expr = new AssignExpr(new ExprValue("x", 5));
        when(exprToString(anyExpression())).thenReturn("x=5");

        prettyPrintVisitor.visitAssignExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitBinaryExpr() {
        Expression expr = new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new ExprValue("+", new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("a = + (3 * 4)");

        prettyPrintVisitor.visitBinaryExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitUnaryExpr() {
        Expression expr = new UnaryExpr(new ExprValue("x", 5));

        when(exprToString(anyExpression())).thenReturn("( x )");

        prettyPrintVisitor.visitUnaryExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitConstExpr() {
        Expression expr = new ConstExpr(new Value(10));
        when(exprToString(anyExpression())).thenReturn("10");

        prettyPrintVisitor.visitConstExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitFunctionCallExpr() {
        Expression expr = new FunctionCallExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x + (3 * 4) )");

        prettyPrintVisitor.visitFunctionCallExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitPropertyPathExpr() {
        Expression expr = new PropertyPathExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn(" x [ a + (3 * 4) ]");

        prettyPrintVisitor.visitPropertyPathExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitAnonymousScriptExpr() {
        Expression expr = new AnonymousScriptExpr(new ExprValue(10));

        when(exprToString(anyExpression())).thenReturn("( x )");

        prettyPrintVisitor.visitAnonymousScriptExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitFunctionScriptExpr() {
        Expression expr = new FunctionScriptExpr(new BinaryExpr(new AssignExpr(new ExprValue("x", 5), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x + (3 * 4) )");

        prettyPrintVisitor.visitFunctionScriptExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitStatementSequenceScript() {
        Expression expr = new StatementSequenceScript(new BinaryExpr(new AssignExpr(new ExprValue("x", 5), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x + (3 * 4) )");

        prettyPrintVisitor.visitStatementSequenceScript(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitVarExpr() {
        Expression expr = new VarExpr(new AssignExpr(new ExprValue("x", 5)));

        when(exprToString(anyExpression())).thenReturn("( x )");

        prettyPrintVisitor.visitVarExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitProjectionExpr() {
        Expression expr = new ProjectionExpr(new AssignExpr(new ExprValue("a", 3), new AssignExpr(new ExprValue("b", 4))));

        when(exprToString(anyExpression())).thenReturn("( a . b )");

        prettyPrintVisitor.visitProjectionExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitAliasExpr() {
        Expression expr = new AliasExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x . a )");

        prettyPrintVisitor.visitAliasExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitVectorExpr() {
        Expression expr = new VectorExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x [ a + (3 * 4) ]");

        prettyPrintVisitor.visitVectorExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitIndexExpr() {
        Expression expr = new IndexExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x . a )");

        prettyPrintVisitor.visitIndexExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitDecimalExpr() {
        Expression expr = new DecimalExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x . a )");

        prettyPrintVisitor.visitDecimalExpr(expr);
        verify(printer).exprToString(expr);
    }

    @Test
    public void testVisitIfElseExpr() {
        Expression expr = new IfElseExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x > (3 * 4) ) ? a : b");

        prettyPrintVisitor.visitIfElseExpr(expr);
        verify(printer).exprToString(expr);
    }

}