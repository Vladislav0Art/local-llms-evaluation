package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr expr = new BinaryExpr(new VariableExpr("x", false), new VariableExpr("y", false), BinaryOp.PLUS);
        expr.accept(visitor);
        assertEquals("x + y", visitor.toString());
    }

}