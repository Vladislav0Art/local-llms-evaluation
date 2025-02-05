package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedTest {

    private static final PrettyPrintVisitor visitor = new PrettyPrintVisitor(PrinterFactory.newCollectingPrinter());

    @Test
    public void exprToStringTest() {
        String expectedResult = "a + 1";
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), BinaryOp.PLUS, new DecimalExpr(new BigDecimal(1)));
        String result = PrettyPrintVisitor.exprToString(binaryExpr);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr(new VarExpr("a"), AssignOp.EQUAL, new DecimalExpr(new BigDecimal(1)));
        expr.visit(visitor);

        Assert.assertEquals("a = 1", visitor.getPrinter().toString());
    }

    @Test
    public void visitBinaryExprTest() {
        /* implementation */
    }

    @Test
    public void visitUnaryExprTest() {
        /* implementation */
    }

    @Test
    public void visitConstExprTest() {
        /* implementation */
    }

    @Test
    public void visitFunctionCallExprTest() {
        /* implementation */
    }

    @Test
    public void visitPropertyPathExprTest() {
        /* implementation */
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        /* implementation */
    }

    @Test
    public void visitFunctionScriptExprTest() {
        /* implementation */
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        /* implementation */
    }

    @Test
    public void visitVarExprTest() {
        /* implementation */
    }

    @Test
    public void visitProjectionExprTest() {
        /* implementation */
    }

    @Test
    public void visitAliasExprTest() {
        /* implementation */
    }

    @Test
    public void visitVectorExprTest() {
        /* implementation */
    }

    @Test
    public void visitIndexExprTest() {
        /* implementation */
    }

    @Test
    public void visitDecimalExprTest() {
        /* implementation */
    }

    @Test
    public void visitIfElseExprTest() {
        /* implementation */
    }

}