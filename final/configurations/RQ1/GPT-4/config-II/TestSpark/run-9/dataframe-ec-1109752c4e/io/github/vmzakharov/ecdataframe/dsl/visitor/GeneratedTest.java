package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        FunctionScript functionScript = new FunctionScript("test");
        functionScript.addExpression(new AssingExpr("x", new DecimalValue(10)));
        AnonymousScript anonymousScript = new AnonymousScript();
        anonymousScript.addExpression(new VarExpr("y"));

        assertEquals("function test\n{\n  x = 10\n}", PrettyPrintVisitor.exprToString(functionScript));
        assertEquals("y", PrettyPrintVisitor.exprToString(anonymousScript));
    }

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssingExpr assignExpr = new AssingExpr("result", new DecimalValue(10));
        visitor.visitAssignExpr(assignExpr);

        assertEquals("result = 10", visitor.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr binaryExpr = new BinaryExpr(new DecimalValue(10), BinaryOp.ADD, new DecimalValue(20));
        visitor.visitBinaryExpr(binaryExpr);

        assertEquals("(10 + 20)", visitor.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.MINUS, new DecimalValue(10));
        visitor.visitUnaryExpr(unaryExpr);

        assertEquals("- (10)", visitor.toString());
    }

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(new StringValue("Test String"));

        assertEquals("\"Test String\"", visitor.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("print", new StringValue("Hello"));
        visitor.visitFunctionCallExpr(functionCallExpr);

        assertEquals("print(\"Hello\")", visitor.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("object.property");
        visitor.visitPropertyPathExpr(propertyPathExpr);

        assertEquals("object.property", visitor.toString());
    }

    @Test
    public void visitFunctionScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScript = new FunctionScript("printHello");
        functionScript.addExpression(new FunctionCallExpr("print", new StringValue("Hello")));
        visitor.visitFunctionScriptExpr(functionScript);

        assertEquals("function printHello\n{\n  print(\"Hello\")\n}", visitor.toString());
    }

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr varExpr = new VarExpr("x");
        visitor.visitVarExpr(varExpr);

        assertEquals("x", visitor.toString());
    }

    @Test
    public void visitAliasExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr aliasExpr = new AliasExpr("a", new DecimalValue(10));
        visitor.visitAliasExpr(aliasExpr);

        assertEquals("a : 10", visitor.toString());
    }

    @Test
    public void visitVectorExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExpr = new VectorExpr();
        vectorExpr.addElement(new DecimalValue(10));
        vectorExpr.addElement(new DecimalValue(20));
        visitor.visitVectorExpr(vectorExpr);

        assertEquals("(10, 20)", visitor.toString());
    }

    @Test
    public void visitIndexExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr indexExpr = new IndexExpr(new VarExpr("v"), new DecimalValue(1));
        visitor.visitIndexExpr(indexExpr);

        assertEquals("v[1]", visitor.toString());
    }

    @Test
    public void visitDecimalExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr decimalExpr = new DecimalExpr(new DecimalValue(10), new DecimalValue(2));
        visitor.visitDecimalExpr(decimalExpr);

        assertEquals("[10, 2]", visitor.toString());
    }

    @Test
    public void visitIfElseExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IfElseExpr ifElseExpr = new IfElseExpr(new BooleanValue(false), new VarExpr("x"), new VarExpr("y"));
        visitor.visitIfElseExpr(ifElseExpr);

        assertEquals("(false) ? x : y", visitor.toString());
    }

}