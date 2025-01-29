package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitAliasExpr {

    @Test
    public void testVisitAliasExpr() {
        Expression expr = new AliasExpr("z", "float");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(0, PrettyPrintVisitor.visitAliasExpr(expr));
    }

}