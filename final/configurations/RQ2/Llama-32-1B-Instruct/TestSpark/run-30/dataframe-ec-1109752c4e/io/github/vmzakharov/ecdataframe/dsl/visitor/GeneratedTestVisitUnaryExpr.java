package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestVisitUnaryExpr {

    private PrettyPrintVisitor visitor;
    private Printer newPrinter;

    @BeforeEach
    public void setup() {
        visitor = new PrettyPrintVisitor();
        newPrinter = mock(Printer.class);
    }

    @Test
    public void testVisitUnaryExpr() {
        Expression expr = StringIterate.generate("Math.sin(0.5)", ListIterable.of(0.5)).toExpression();
        when(expr.toString()).thenReturn("");

        visitor.visitUnaryExpr(expr);

        verify(newPrinter).print("Math.sin(0.5)", "Math.sin(0.5)");
    }

}