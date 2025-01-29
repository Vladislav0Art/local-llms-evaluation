package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitBinaryExpr {

    @Test
    public void testVisitBinaryExpr() {
        Expression expr = new BinaryExpr(new VarExpr("x", "int"), new UnaryExpr(">", 5), new VarExpr("y", "float"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitBinaryExpr(expr));
    }

}