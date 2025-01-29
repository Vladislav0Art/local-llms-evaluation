package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression assignExpr = new AnonymousScriptExpr(new VarExpr("x"));
        visitor.visitAssignExpr(assignExpr);
        assertMocked(visitor.printer, Value.create("x"));
    }

}