package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitConstExpr {

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression constExpr = new ConstExpr(Value.create(10));
        visitor.visitConstExpr(constExpr);
        assertMocked(visitor.printer, Value.create("10"));
    }

}