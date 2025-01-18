package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr expr = new UnaryExpr(new VariableExpr("x", false), UnaryOp.MINUS);
        expr.accept(visitor);
        assertEquals("-x", visitor.toString());
    }

}