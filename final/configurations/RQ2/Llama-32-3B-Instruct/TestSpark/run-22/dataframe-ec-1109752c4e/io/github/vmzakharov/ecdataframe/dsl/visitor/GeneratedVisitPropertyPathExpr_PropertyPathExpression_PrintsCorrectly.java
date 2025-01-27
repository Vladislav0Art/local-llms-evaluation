package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExpr_PropertyPathExpression_PrintsCorrectly {

    @Test
    public void visitPropertyPathExpr_PropertyPathExpression_PrintsCorrectly() {
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("e"), "f.g");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertEquals(".f.g", result);
    }

}