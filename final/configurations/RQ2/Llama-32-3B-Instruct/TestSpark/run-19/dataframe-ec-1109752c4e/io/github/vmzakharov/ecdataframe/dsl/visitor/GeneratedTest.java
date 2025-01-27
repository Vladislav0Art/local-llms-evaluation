package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringExpressionIsConvertedToPrettyString() {
        Expression e = new DecimalExpr(1, 2);
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertEquals("DecimalExpr(id=1, value=2)", result);
    }

    @Test
    public void exprToStringAnonymousScriptIsConvertedToPrettyString() {
        Expression e = new AnonymousScript("some script");
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertEquals("AnonymousScript(some script)", result);
    }

    @Test
    public void exprToStringPropertyPathIsConvertedToPrettyString() {
        PropertyPathExpr e = new PropertyPathExpr("some.path");
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertEquals("PropertyPathExpr(some.path)", result);
    }

    @Test
    public void visitAssignExprIsVisitedCorrectly() {
        AssigningExpr expr = new AssigningExpr(1, 2);
        io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
        assertEquals("1=2", io.github.vmzakharov.ecdataframe.util.CollectingPrinter.print());
    }

    @Test
    public void visitBinaryExprIsVisitedCorrectly() {
        BinaryExpr expr = new BinaryExpr(1, 2, "+");
        io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
        assertEquals("1+2", io.github.vmzakharov.ecdataframe.util.CollectingPrinter.print());
    }

    @Test
    public void visitFunctionCallExprIsVisitedCorrectly() {
        FunctionCallExpr expr = new FunctionCallExpr("some function", 1, 2);
        io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
        assertEquals("some function(1,2)", io.github.vmzakharov.ecdataframe.util.CollectingPrinter.print());
    }

}