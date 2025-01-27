package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_EmptyExpr_ReturnsEmptyString() {
        Expression expr = mock(Expression.class);
        when(exprToString(anyExpression())).thenReturn("");
        assertThat(prettyPrintVisitor.exprToString(expr), is(""));
    }

    @Test
    public void exprToString_SimpleValue_ReturnsValueAsStr() {
        Value value = new Value("value");
        Expression expr = new DecimalExpr(value);
        when(exprToString(anyExpression())).thenReturn(value.toString());
        assertThat(prettyPrintVisitor.exprToString(expr), is(value.toString()));
    }

    @Test
    public void exprToString_BinaryExpr_ReturnsCorrectlyFormedString() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), "+", new DecimalExpr(2));
        Expression expr = binaryExpr;
        when(exprToString(anyExpression())).thenReturn(binaryExpr.toString());
        assertThat(prettyPrintVisitor.exprToString(expr), is(binaryExpr.toString()));
    }

    @Test
    public void visitAssignExpr_AssignExpression_PassesCorrectly() {
        AssigningExpr assigningExpr = new AssigningExpr("a", new DecimalExpr(2));
        prettyPrintVisitor.visitAssignExpr(assigningExpr);
    }

    @Test
    public void visitBinaryExpr_BinaryExpression_PassesCorrectly() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), "+", new DecimalExpr(2));
        prettyPrintVisitor.visitBinaryExpr(binaryExpr);
    }

    @Test
    public void visitUnaryExpr_UnaryExpression_PassesCorrectly() {
        UnaryExpr unaryExpr = new UnaryExpr(new VarExpr("a"), "-");
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
    }

    @Test
    public void visitConstExpr_ConstExpression_PassesCorrectly() {
        Value value = new Value(2);
        prettyPrintVisitor.visitConstExpr(value);
    }

    @Test
    public void visitFunctionCallExpr_FunctionCallExpression_PassesCorrectly() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr(new VarExpr("a"), "function");
        prettyPrintVisitor.visitFunctionCallExpr(functionCallExpr);
    }

    @Test
    public void visitPropertyPathExpr_PropertyPathExpression_PassesCorrectly() {
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("a.b.c", new DecimalExpr(2));
        prettyPrintVisitor.visitPropertyPathExpr(propertyPathExpr);
    }

    @Test
    public void visitAnonymousScriptExpr_AnonymousScriptExpression_PassesCorrectly() {
        AnonymousScript anonymousScript = new AnonymousScript("{1, 2, 3}");
        prettyPrintVisitor.visitAnonymousScriptExpr(anonymousScript);
    }

    @Test
    public void visitFunctionScriptExpr_FunctionScriptExpression_PassesCorrectly() {
        FunctionScript functionScript = new FunctionScript("function(a) { return a; }");
        prettyPrintVisitor.visitFunctionScriptExpr(functionScript);
    }

    @Test
    public void visitStatementSequenceScript_StatementSequenceScriptExpression_PassesCorrectly() {
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript("{1, 2, 3}");
        prettyPrintVisitor.visitStatementSequenceScript(statementSequenceScript);
    }

    @Test
    public void visitVarExpr_VarExpression_PassesCorrectly() {
        VarExpr varExpr = new VarExpr("a");
        prettyPrintVisitor.visitVarExpr(varExpr);
    }

    @Test
    public void visitProjectionExpr_ProjectionExpression_PassesCorrectly() {
        ProjectionExpr projectionExpr = new ProjectionExpr(new DecimalExpr(2), "a");
        prettyPrintVisitor.visitProjectionExpr(projectionExpr);
    }

    @Test
    public void visitAliasExpr_AliasExpression_PassesCorrectly() {
        AliasExpr aliasExpr = new AliasExpr("a", new VarExpr("b"));
        prettyPrintVisitor.visitAliasExpr(aliasExpr);
    }

    @Test
    public void visitVectorExpr_VectorExpression_PassesCorrectly() {
        VectorExpr vectorExpr = new VectorExpr(new DecimalExpr(2), new DecimalExpr(3));
        prettyPrintVisitor.visitVectorExpr(vectorExpr);
    }

    @Test
    public void visitIndexExpr_IndexExpression_PassesCorrectly() {
        IndexExpr indexExpr = new IndexExpr(new VarExpr("a"), 1);
        prettyPrintVisitor.visitIndexExpr(indexExpr);
    }

    @Test
    public void visitDecimalExpr_DecimalExpression_PassesCorrectly() {
        DecimalExpr decimalExpr = new DecimalExpr(2);
        prettyPrintVisitor.visitDecimalExpr(decimalExpr);
    }

    @Test
    public void visitIfElseExpr_IfElseExpression_PassesCorrectly() {
        IfElseExpr ifElseExpr = new IfElseExpr("a", 2, 3);
        prettyPrintVisitor.visitIfElseExpr(ifElseExpr);
    }

}