package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

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
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression mockExpression = Mockito.mock(Expression.class);
        assertEquals(null, PrettyPrintVisitor.exprToString(mockExpression));
    }

    @Test
    public void visitAssignExprTest() {
        AssignExpr mockAssignExpr = Mockito.mock(AssignExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitAssignExpr(mockAssignExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr mockBinaryExpr = Mockito.mock(BinaryExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitBinaryExpr(mockBinaryExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr mockUnaryExpr = Mockito.mock(UnaryExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitUnaryExpr(mockUnaryExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitConstExprTest() {
        Value mockValue = Mockito.mock(Value.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitConstExpr(mockValue);
        assertEquals(null, result);
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr mockFunctionCallExpr = Mockito.mock(FunctionCallExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitFunctionCallExpr(mockFunctionCallExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr mockPropertyPathExpr = Mockito.mock(PropertyPathExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitPropertyPathExpr(mockPropertyPathExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript mockAnonymousScript = Mockito.mock(AnonymousScript.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitAnonymousScriptExpr(mockAnonymousScript);
        assertEquals(null, result);
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript mockFunctionScript = Mockito.mock(FunctionScript.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitFunctionScriptExpr(mockFunctionScript);
        assertEquals(null, result);
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript mockStatementSequenceScript = Mockito.mock(StatementSequenceScript.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitStatementSequenceScript(mockStatementSequenceScript);
        assertEquals(null, result);
    }

    @Test
    public void visitVarExprTest() {
        VarExpr mockVarExpr = Mockito.mock(VarExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitVarExpr(mockVarExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr mockProjectionExpr = Mockito.mock(ProjectionExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitProjectionExpr(mockProjectionExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr mockAliasExpr = Mockito.mock(AliasExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitAliasExpr(mockAliasExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr mockVectorExpr = Mockito.mock(VectorExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitVectorExpr(mockVectorExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr mockIndexExpr = Mockito.mock(IndexExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitIndexExpr(mockIndexExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr mockDecimalExpr = Mockito.mock(DecimalExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitDecimalExpr(mockDecimalExpr);
        assertEquals(null, result);
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr mockIfElseExpr = Mockito.mock(IfElseExpr.class);
        String result = new PrettyPrintVisitor(new CollectingPrinter()).visitIfElseExpr(mockIfElseExpr);
        assertEquals(null, result);
    }

}