package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitDecimalExpr {

    @Test
    public void testVisitDecimalExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression decimalExpr = new DecimalExpr(new ConstExpr(Value.create(10.0)));
        visitor.visitDecimalExpr(decimalExpr);
        assertMocked(visitor.printer, Value.create("10"));
    }

}