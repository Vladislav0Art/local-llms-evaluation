package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitIndexExpr {

    @Test
    public void testVisitIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression indexExpr = new IndexExpr(new ConstExpr(Value.create(5)), "x");
        visitor.visitIndexExpr(indexExpr);
        assertMocked(visitor.printer, Value.create("5"));
    }

}