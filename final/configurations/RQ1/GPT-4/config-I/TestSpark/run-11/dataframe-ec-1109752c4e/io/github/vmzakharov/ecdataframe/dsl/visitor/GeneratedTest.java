package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = new PropertyPathExpr(Lists.mutable.of("property1", "property2"));
        assertEquals("property1.property2", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitConstExprTest() {
        StringValue expr = new StringValue("testValue");
        assertEquals("'testValue'", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitVarExprTest() {
        VarExpr expr = new VarExpr("testName", false);
        assertEquals("testName", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr("varName", false, new StringValue("testValue"));
        assertEquals("varName = 'testValue'", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = new FunctionCallExpr("functionName", Lists.immutable.of(new StringValue("parameter1"), new StringValue("parameter2")));
        assertEquals("functionName('parameter1', 'parameter2')", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = new PropertyPathExpr(Lists.immutable.of("property1", "property2"));
        assertEquals("property1.property2", PrettyPrintVisitor.exprToString(expr));
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new StringValue("testValue"));
        assertEquals("not 'testValue'", PrettyPrintVisitor.exprToString(expr));
    }

}