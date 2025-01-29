package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitVectorExpr {

    @Test
    public void testVisitVectorExpr() {
        Expression expr = new VectorExpr(new VarExpr("x", "int"), new VarExpr("y", "float"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitVectorExpr(expr));
    }

}