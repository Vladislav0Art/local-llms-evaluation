package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringPropertyPathIsConvertedToPrettyString {

    @Test
    public void exprToStringPropertyPathIsConvertedToPrettyString() {
        PropertyPathExpr e = new PropertyPathExpr("some.path");
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertEquals("PropertyPathExpr(some.path)", result);
    }

}