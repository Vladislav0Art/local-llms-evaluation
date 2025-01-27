package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExpr_UnaryExpressionWithAlias_PrintsCorrectly {

    @Test
    public void visitUnaryExpr_UnaryExpressionWithAlias_PrintsCorrectly() {
        AliasExpr aliasExpr = new AliasExpr(new VarExpr("c"), "d");
        UnaryExpr expr = new UnaryExpr(aliasExpr, "+");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals("+d", result);
    }

}