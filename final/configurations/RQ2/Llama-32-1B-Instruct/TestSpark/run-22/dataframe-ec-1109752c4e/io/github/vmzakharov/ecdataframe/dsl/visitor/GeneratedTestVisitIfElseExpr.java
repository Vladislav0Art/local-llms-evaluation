package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitIfElseExpr {

    @Test
    public void testVisitIfElseExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression ifElseExpr = new IfElseExpr(new ConstExpr(Value.create(5)), new VarExpr("x"), new ConstExpr(Value.create(10)));
        visitor.visitIfElseExpr(ifElseExpr);
        assertMocked(visitor.printer, Value.create("if", "5"));
    }

    public void assertMocked(Printer printer, Object expectedValue) {
        Mockito.when(printer.print(eq(expectedValue))).thenReturn(expectedValue);
    }

}