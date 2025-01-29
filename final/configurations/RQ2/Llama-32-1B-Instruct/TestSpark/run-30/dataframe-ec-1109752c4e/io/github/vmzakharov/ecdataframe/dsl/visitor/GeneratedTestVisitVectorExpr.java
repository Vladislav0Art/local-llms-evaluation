package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestVisitVectorExpr {

    private PrettyPrintVisitor visitor;
    private Printer newPrinter;

    @BeforeEach
    public void setup() {
        visitor = new PrettyPrintVisitor();
        newPrinter = mock(Printer.class);
    }

    @Test
    public void testVisitVectorExpr() {
        Expression expr = StringIterate.generate(() -> newVectorExpr(1), ListIterable.of(2)).toExpression();
        when(expr.toString()).thenReturn("");

        visitor.visitVectorExpr(expr);

        verify(newPrinter).print(() -> newVectorExpr(1), "(() -> newVectorExpr(1))");
    }

}