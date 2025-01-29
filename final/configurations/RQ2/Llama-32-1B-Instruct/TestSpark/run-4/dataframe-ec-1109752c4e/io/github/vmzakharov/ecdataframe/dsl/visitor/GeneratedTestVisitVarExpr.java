package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitVarExpr {

    @Test
    public void testVisitVarExpr() {
        Expression expr = new VarExpr("x", "int");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(0, PrettyPrintVisitor.visitVarExpr(expr));
    }

}