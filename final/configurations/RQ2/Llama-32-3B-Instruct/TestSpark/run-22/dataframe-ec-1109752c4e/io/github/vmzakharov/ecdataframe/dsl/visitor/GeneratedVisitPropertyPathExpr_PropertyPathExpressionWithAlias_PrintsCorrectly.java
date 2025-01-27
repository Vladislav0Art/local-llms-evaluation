package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExpr_PropertyPathExpressionWithAlias_PrintsCorrectly {

    @Test
    public void visitPropertyPathExpr_PropertyPathExpressionWithAlias_PrintsCorrectly() {
        AliasExpr aliasExpr = new AliasExpr(new VarExpr("h"), "i");
        PropertyPathExpr expr = new PropertyPathExpr(aliasExpr, "j.k.l");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals(".i.j.k.l", result);
    }

}