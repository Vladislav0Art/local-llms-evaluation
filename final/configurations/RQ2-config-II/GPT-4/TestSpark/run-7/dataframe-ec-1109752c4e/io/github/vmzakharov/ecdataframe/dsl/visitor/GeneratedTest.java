package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression expressionMock = Mockito.mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(expressionMock);
        assertNotNull(result);
    }

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssingExpr assingExprMock = Mockito.mock(AssingExpr.class);
        visitor.visitAssignExpr(assingExprMock);
    }

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr binaryExprMock = Mockito.mock(BinaryExpr.class);
        visitor.visitBinaryExpr(binaryExprMock);
    }

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr unaryExprMock = Mockito.mock(UnaryExpr.class);
        visitor.visitUnaryExpr(unaryExprMock);
    }

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value valueMock = Mockito.mock(Value.class);
        visitor.visitConstExpr(valueMock);
    }

    @Test
    public void visitFunctionCallExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr functionCallExprMock = Mockito.mock(FunctionCallExpr.class);
        visitor.visitFunctionCallExpr(functionCallExprMock);
    }

    @Test
    public void visitPropertyPathExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr propertyPathExprMock = Mockito.mock(PropertyPathExpr.class);
        visitor.visitPropertyPathExpr(propertyPathExprMock);
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript anonymousScriptMock = Mockito.mock(AnonymousScript.class);
        visitor.visitAnonymousScriptExpr(anonymousScriptMock);
    }

    @Test
    public void visitFunctionScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScriptMock = Mockito.mock(FunctionScript.class);
        visitor.visitFunctionScriptExpr(functionScriptMock);
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript statementSequenceScriptMock = Mockito.mock(StatementSequenceScript.class);
        visitor.visitStatementSequenceScript(statementSequenceScriptMock);
    }

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr varExprMock = Mockito.mock(VarExpr.class);
        visitor.visitVarExpr(varExprMock);
    }

    @Test
    public void visitProjectionExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr projectionExprMock = Mockito.mock(ProjectionExpr.class);
        visitor.visitProjectionExpr(projectionExprMock);
    }

    @Test
    public void visitAliasExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr aliasExprMock = Mockito.mock(AliasExpr.class);
        visitor.visitAliasExpr(aliasExprMock);
    }

    @Test
    public void visitVectorExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExprMock = Mockito.mock(VectorExpr.class);
        visitor.visitVectorExpr(vectorExprMock);
    }

    @Test
    public void visitIndexExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr indexExprMock = Mockito.mock(IndexExpr.class);
        visitor.visitIndexExpr(indexExprMock);
    }

    @Test
    public void visitDecimalExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr decimalExprMock = Mockito.mock(DecimalExpr.class);
        visitor.visitDecimalExpr(decimalExprMock);
    }

    @Test
    public void visitIfElseExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr ifElseExprMock = Mockito.mock(IfElseExpr.class);
        visitor.visitIfElseExpr(ifElseExprMock);
    }

    @Test
    public void prettyPrintVisitorWithPrinterTest() {
        Printer printerMock = Mockito.mock(Printer.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printerMock);
        assertNotNull(prettyPrintVisitor);
    }

}