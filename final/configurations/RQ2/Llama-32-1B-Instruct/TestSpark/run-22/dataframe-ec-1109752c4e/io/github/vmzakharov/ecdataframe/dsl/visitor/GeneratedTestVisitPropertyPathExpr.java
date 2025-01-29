package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitPropertyPathExpr {

    @Test
    public void testVisitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression propertyPathExpr = new PropertyPathExpr(new VarExpr("x"), "y");
        visitor.visitPropertyPathExpr(propertyPathExpr);
        assertMocked(visitor.printer, Value.create("x.y"));
    }

}