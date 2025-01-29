package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitIndexExpr {

    @Test
    public void testVisitIndexExpr() {
        Expression expr = new IndexExpr(new VarExpr("x", "int"), 2);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(0, PrettyPrintVisitor.visitIndexExpr(expr));
    }

}