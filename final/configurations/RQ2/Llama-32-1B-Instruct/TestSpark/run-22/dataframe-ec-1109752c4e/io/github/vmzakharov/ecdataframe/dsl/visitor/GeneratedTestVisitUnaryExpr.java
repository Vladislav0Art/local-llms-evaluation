package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitUnaryExpr {

    @Test
    public void testVisitUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression unaryExpr = new UnaryExpr(new ConstExpr(Value.create(-5)));
        visitor.visitUnaryExpr(unaryExpr);
        assertMocked(visitor.printer, Value.create("-5"));
    }

}