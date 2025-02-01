package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assingExpr = mock(AssingExpr.class);
        assingExpr.visit(new PrettyPrintVisitor(assingExpr, false));
        String expectResult = "${AssignExpr}";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(assingExpr));
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = mock(BinaryExpr.class);
        binaryExpr.visit(new PrettyPrintVisitor(binaryExpr, false));
        String expectResult = "(BinaryExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(binaryExpr));
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = mock(UnaryExpr.class);
        unaryExpr.visit(new PrettyPrintVisitor(unaryExpr, false));
        String expectResult = "(UnaryExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(unaryExpr));
    }

    @Test
    public void visitConstExprTest() {
        Value value = Value.newValue("ConstExprString");
        value.visit(new PrettyPrintVisitor(value, false));
        String expectResult = "(ConstExprString)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(value));
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = mock(FunctionCallExpr.class);
        functionCallExpr.visit(new PrettyPrintVisitor(functionCallExpr, false));
        String expectResult = "(FunctionCallExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(functionCallExpr));
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = mock(PropertyPathExpr.class);
        propertyPathExpr.visit(new PrettyPrintVisitor(propertyPathExpr, false));
        String expectResult = "(PropertyPathExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(propertyPathExpr));
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript anonymousScript = mock(AnonymousScript.class);
        anonymousScript.visit(new PrettyPrintVisitor(anonymousScript, false));
        String expectResult = "(AnonymousScript)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(anonymousScript));
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript functionScript = mock(FunctionScript.class);
        functionScript.visit(new PrettyPrintVisitor(functionScript, false));
        String expectResult = "(FunctionScript)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(functionScript));
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript statementSequenceScript = mock(StatementSequenceScript.class);
        statementSequenceScript.visit(new PrettyPrintVisitor(statementSequenceScript, false));
        String expectResult = "(StatementSequenceScript)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(statementSequenceScript));
    }

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = mock(VarExpr.class);
        varExpr.visit(new PrettyPrintVisitor(varExpr, false));
        String expectResult = "(VarExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(varExpr));
    }

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr projectionExpr = mock(ProjectionExpr.class);
        projectionExpr.visit(new PrettyPrintVisitor(projectionExpr, false));
        String expectResult = "(ProjectionExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(projectionExpr));
    }

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = mock(AliasExpr.class);
        aliasExpr.visit(new PrettyPrintVisitor(aliasExpr, false));
        String expectResult = "(AliasExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(aliasExpr));
    }

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = mock(VectorExpr.class);
        vectorExpr.visit(new PrettyPrintVisitor(vectorExpr, false));
        String expectResult = "(VectorExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(vectorExpr));
    }

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = mock(IndexExpr.class);
        indexExpr.visit(new PrettyPrintVisitor(indexExpr, false));
        String expectResult = "(IndexExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(indexExpr));
    }

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = mock(DecimalExpr.class);
        decimalExpr.visit(new PrettyPrintVisitor(decimalExpr, false));
        String expectResult = "(DecimalExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(decimalExpr));
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = mock(IfElseExpr.class);
        ifElseExpr.visit(new PrettyPrintVisitor(ifElseExpr, false));
        String expectResult = "(IfElseExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(ifElseExpr));
    }

}