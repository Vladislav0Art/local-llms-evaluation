package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr dummyAssignExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAssignExpr(dummyAssignExpr);
        /* provide assertions */
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr dummyBinaryExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitBinaryExpr(dummyBinaryExpr);
        /* provide assertions */
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr dummyUnaryExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitUnaryExpr(dummyUnaryExpr);
        /* provide assertions */
    }

    @Test
    public void visitConstExprTest() {
        Value dummyValue = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitConstExpr(dummyValue);
        /* provide assertions */
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr dummyFunctionCallExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitFunctionCallExpr(dummyFunctionCallExpr);
        /* provide assertions */
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr dummyPropertyPathExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitPropertyPathExpr(dummyPropertyPathExpr);
        /* provide assertions */
    }

    @Test
    public void exprToStringTest() {
        Expression dummyExpression = /* initialize object */;
        String expected = /* expected string representation */;
        String actual = PrettyPrintVisitor.exprToString(dummyExpression);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript dummyAnonymousScript = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAnonymousScriptExpr(dummyAnonymousScript);
        /* provide assertions */
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript dummyFunctionScript = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitFunctionScriptExpr(dummyFunctionScript);
        /* provide assertions */
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript dummyStatementSequenceScript = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitStatementSequenceScript(dummyStatementSequenceScript);
        /* provide assertions */
    }

    @Test
    public void visitVarExprTest() {
        VarExpr dummyVarExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitVarExpr(dummyVarExpr);
        /* provide assertions */
    }

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr dummyProjectionExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitProjectionExpr(dummyProjectionExpr);
        /* provide assertions */
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr dummyAliasExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAliasExpr(dummyAliasExpr);
        /* provide assertions */
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr dummyVectorExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitVectorExpr(dummyVectorExpr);
        /* provide assertions */
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr dummyIndexExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitIndexExpr(dummyIndexExpr);
        /* provide assertions */
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr dummyDecimalExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitDecimalExpr(dummyDecimalExpr);
        /* provide assertions */
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr dummyIfElseExpr = /* initialize object */;
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitIfElseExpr(dummyIfElseExpr);
        /* provide assertions */
    }

}