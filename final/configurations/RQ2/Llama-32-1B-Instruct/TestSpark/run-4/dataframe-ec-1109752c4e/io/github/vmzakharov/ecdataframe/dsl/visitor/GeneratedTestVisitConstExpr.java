package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitConstExpr {

    @Test
    public void testVisitConstExpr() {
        Expression expr = new ConstExpr(new Value(10));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(0, PrettyPrintVisitor.visitConstExpr(expr));
    }

}