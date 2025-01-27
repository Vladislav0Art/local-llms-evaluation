package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringAnonymousScriptIsConvertedToPrettyString {

    @Test
    public void exprToStringAnonymousScriptIsConvertedToPrettyString() {
        Expression e = new AnonymousScript("some script");
        String result = io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.exprToString(e);
        assertEquals("AnonymousScript(some script)", result);
    }

}