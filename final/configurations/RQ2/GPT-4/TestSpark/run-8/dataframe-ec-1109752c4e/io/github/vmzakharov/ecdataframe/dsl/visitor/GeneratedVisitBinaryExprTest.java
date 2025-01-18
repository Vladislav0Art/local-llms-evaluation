package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        AssingExpr assignExpr = new AssingExpr(null, new VarExpression(null, "x"), new DecimalExpr(null, new ConstantExpression(null, 10.0)));
        String output = PrettyPrintVisitor.exprToString(assignExpr);
        assertEquals("x = DECIMAL", output.trim());
    }

}