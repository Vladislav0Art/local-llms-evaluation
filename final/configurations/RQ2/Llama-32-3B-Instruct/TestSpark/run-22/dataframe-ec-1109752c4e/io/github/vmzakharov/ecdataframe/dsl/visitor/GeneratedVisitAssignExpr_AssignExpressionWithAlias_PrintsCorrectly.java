package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExpr_AssignExpressionWithAlias_PrintsCorrectly {

    @Test
    public void visitAssignExpr_AssignExpressionWithAlias_PrintsCorrectly() {
        AliasExpr aliasExpr = new AliasExpr(new VarExpr("y"), "z");
        AssingExpr expr = new AssingExpr(aliasExpr, new ConstExpr(20));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals("z <- 20", result);
    }

}