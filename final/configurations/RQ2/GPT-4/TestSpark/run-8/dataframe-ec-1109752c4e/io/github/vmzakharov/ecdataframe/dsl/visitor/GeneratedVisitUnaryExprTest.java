package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.MINUS, new DecimalExpr(null, new ConstantExpression(null, 10.0)));
        String output = PrettyPrintVisitor.exprToString(unaryExpr);
        assertEquals("-DECIMAL", output.trim());
    }

}