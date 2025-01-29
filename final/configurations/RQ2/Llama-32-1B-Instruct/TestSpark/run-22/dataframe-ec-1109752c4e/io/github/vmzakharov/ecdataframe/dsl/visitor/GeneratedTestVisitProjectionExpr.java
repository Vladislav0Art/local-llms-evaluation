package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitProjectionExpr {

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression projectionExpr = new ProjectionExpr(new ConstExpr(Value.create(1)), new VarExpr("x"));
        visitor.visitProjectionExpr(projectionExpr);
        assertMocked(visitor.printer, Value.create("1.x"));
    }

}