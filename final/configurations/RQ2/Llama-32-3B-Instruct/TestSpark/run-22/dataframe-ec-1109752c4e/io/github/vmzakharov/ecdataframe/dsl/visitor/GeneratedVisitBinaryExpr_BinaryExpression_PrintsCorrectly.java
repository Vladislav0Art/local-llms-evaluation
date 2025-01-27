package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExpr_BinaryExpression_PrintsCorrectly {

    @Test
    public void visitBinaryExpr_BinaryExpression_PrintsCorrectly() {
        BinaryExpr expr = new BinaryExpr(new ConstExpr(1), "+", new ConstExpr(2));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals("1+2", result);
    }

}