package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitPropertyPathExpr {

    @Test
    public void testVisitPropertyPathExpr() {
        Expression expr = new PropertyPathExpr(new VarExpr("x", "int"), new VarExpr("y", "float"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitPropertyPathExpr(expr));
    }

}