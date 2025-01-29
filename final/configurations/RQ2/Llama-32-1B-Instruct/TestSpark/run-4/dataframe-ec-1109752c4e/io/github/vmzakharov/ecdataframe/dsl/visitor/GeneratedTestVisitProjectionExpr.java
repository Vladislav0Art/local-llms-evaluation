package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitProjectionExpr {

    @Test
    public void testVisitProjectionExpr() {
        Expression expr = new ProjectionExpr(new VarExpr("x", "int"), new AliasExpr("y", "float"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitProjectionExpr(expr));
    }

}