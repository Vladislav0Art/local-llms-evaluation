package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestVisitAnonymousScriptExpr {

    private PrettyPrintVisitor visitor;
    private Printer newPrinter;

    @BeforeEach
    public void setup() {
        visitor = new PrettyPrintVisitor();
        newPrinter = mock(Printer.class);
    }

    @Test
    public void testVisitAnonymousScriptExpr() {
        Expression expr = StringIterate.generate(() -> newAnonymousScriptExpr(), ListIterable.of(1)).toExpression();
        when(expr.toString()).thenReturn("");

        visitor.visitAnonymousScriptExpr(expr);

        verify(newPrinter).print(() -> newAnonymousScriptExpr(), "(() -> newAnonymousScriptExpr())");
    }

}