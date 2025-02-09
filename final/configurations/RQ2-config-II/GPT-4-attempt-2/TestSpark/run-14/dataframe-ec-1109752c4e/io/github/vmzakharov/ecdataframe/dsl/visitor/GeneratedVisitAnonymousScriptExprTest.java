package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = Mockito.mock(AnonymousScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAnonymousScriptExpr(expr);
    }

}