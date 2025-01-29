package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitFunctionScriptExpr {

    @Test
    public void testVisitFunctionScriptExpr() {
        Expression expr = new FunctionScriptExpr(new AnonymousScriptExpr(new VarExpr("x", "int"), new AliasExpr("y", "float")));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitFunctionScriptExpr(expr));
    }

}