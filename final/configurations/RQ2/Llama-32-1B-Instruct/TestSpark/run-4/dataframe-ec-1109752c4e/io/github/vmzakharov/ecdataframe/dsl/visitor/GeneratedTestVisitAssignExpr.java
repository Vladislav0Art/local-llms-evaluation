package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        Expression expr = new AnonymousScriptExpr(new VarExpr("x", "int"), new AliasExpr("y", "float"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(0, PrettyPrintVisitor.visitAssignExpr(expr));
    }

}