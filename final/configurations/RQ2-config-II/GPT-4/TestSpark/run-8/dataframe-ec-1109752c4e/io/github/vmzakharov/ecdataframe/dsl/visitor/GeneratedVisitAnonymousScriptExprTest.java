package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = Mockito.mock(AnonymousScript.class);
        Mockito.when(expr.asScriptDescription()).thenReturn("My anonymous script");
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAnonymousScriptExpr(expr);
        assertEquals("My anonymous script", PrettyPrintVisitor.exprToString(expr));
    }

}