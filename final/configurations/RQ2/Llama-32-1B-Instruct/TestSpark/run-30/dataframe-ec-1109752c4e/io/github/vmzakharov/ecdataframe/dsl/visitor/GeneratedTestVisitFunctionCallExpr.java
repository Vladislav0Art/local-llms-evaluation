package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestVisitFunctionCallExpr {

    private PrettyPrintVisitor visitor;
    private Printer newPrinter;

    @BeforeEach
    public void setup() {
        visitor = new PrettyPrintVisitor();
        newPrinter = mock(Printer.class);
    }

    @Test
    public void testVisitFunctionCallExpr() {
        Expression expr = StringIterate.generate(() -> newVarExpr("x"), ListIterable.of(2)).toExpression();
        when(expr.toString()).thenReturn("");

        visitor.visitFunctionCallExpr(expr);

        verify(newPrinter).print(() -> newVarExpr("x"), "(() -> newVarExpr(\"x\")");
    }

}