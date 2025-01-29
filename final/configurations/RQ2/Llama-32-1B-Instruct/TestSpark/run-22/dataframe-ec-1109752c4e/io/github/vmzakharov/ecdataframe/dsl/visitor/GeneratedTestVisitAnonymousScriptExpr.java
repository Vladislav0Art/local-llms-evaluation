package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitAnonymousScriptExpr {

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression anonymousScriptExpr = new AnonymousScriptExpr(new VarExpr("x"));
        visitor.visitAnonymousScriptExpr(anonymousScriptExpr);
        assertMocked(visitor.printer, Value.create("x"));
    }

}