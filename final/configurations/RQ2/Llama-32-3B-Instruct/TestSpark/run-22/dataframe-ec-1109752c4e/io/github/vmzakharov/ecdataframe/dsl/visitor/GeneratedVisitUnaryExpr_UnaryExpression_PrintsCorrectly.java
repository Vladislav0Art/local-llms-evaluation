package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExpr_UnaryExpression_PrintsCorrectly {

    @Test
    public void visitUnaryExpr_UnaryExpression_PrintsCorrectly() {
        UnaryExpr expr = new UnaryExpr(new ConstExpr(5), "+");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals("+5", result);
    }

}