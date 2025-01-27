package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExpr_BinaryExpressionWithAlias_PrintsCorrectly {

    @Test
    public void visitBinaryExpr_BinaryExpressionWithAlias_PrintsCorrectly() {
        AliasExpr aliasExpr = new AliasExpr(new VarExpr("a"), "b");
        BinaryExpr expr = new BinaryExpr(aliasExpr, "+", new ConstExpr(3));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals("b+3", result);
    }

}