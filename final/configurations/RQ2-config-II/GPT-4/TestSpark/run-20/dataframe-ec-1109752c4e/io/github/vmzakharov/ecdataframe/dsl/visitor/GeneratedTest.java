package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringTest() {
        Expression e = new BinaryExpr(new VarExpr("x"), BinaryOp.PLUS, new DecimalExpr(2));

        String value = PrettyPrintVisitor.exprToString(e);

        assertEquals("(x + 2)", value);
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr(new VarExpr("x"), new DecimalExpr(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        assignExpr.visit(visitor);

        assertEquals("x = 2", visitor.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("x"), BinaryOp.PLUS, new DecimalExpr(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        binaryExpr.visit(visitor);

        assertEquals("( x + 2 )", visitor.toString());
    }

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, new VarExpr("x"));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        unaryExpr.visit(visitor);

        assertEquals("( ! x )", visitor.toString());
    }

    @Test
    public void visitConstExprTest() {
        ConstExpr constExpr = new ConstExpr(Value.of(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        constExpr.accept(visitor);

        assertEquals("2", visitor.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr fce = new FunctionCallExpr("sum", new VarExpr("x"), new DecimalExpr(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        fce.visit(visitor);

        assertEquals("sum ( x , 2 )", visitor.toString());
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(new BinaryExpr(new VarExpr("x"), BinaryOp.GREATER, new DecimalExpr(2)), new VarExpr("y"), new VarExpr("z"));

        PrettyPrintVisitor v = new PrettyPrintVisitor();

        ifElseExpr.visit(v);

        assertEquals("if (x > 2) y else z", v.toString());
    }

}