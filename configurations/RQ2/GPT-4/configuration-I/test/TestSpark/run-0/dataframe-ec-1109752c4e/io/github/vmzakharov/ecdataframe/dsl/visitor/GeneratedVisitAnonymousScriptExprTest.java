package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript expr = new AnonymousScript();
        visitor.visitAnonymousScriptExpr(expr);
        assertEquals(AnonymousScript.class, expr.getClass());
    }

}