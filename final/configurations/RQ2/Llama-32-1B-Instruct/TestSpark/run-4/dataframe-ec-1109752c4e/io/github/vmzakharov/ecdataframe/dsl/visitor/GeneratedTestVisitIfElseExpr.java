package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitIfElseExpr {

    @Test
    public void testVisitIfElseExpr() {
        Expression expr = new IfElseExpr(new VarExpr("x", "int"), new Value(true), new VarExpr("y", "float"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitIfElseExpr(expr));
    }

}