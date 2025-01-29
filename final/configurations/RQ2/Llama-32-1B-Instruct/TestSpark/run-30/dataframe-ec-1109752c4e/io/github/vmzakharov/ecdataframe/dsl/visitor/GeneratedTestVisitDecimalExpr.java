package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestVisitDecimalExpr {

    private PrettyPrintVisitor visitor;
    private Printer newPrinter;

    @BeforeEach
    public void setup() {
        visitor = new PrettyPrintVisitor();
        newPrinter = mock(Printer.class);
    }

    @Test
    public void testVisitDecimalExpr() {
        Expression expr = StringIterate.generate("1.5", ListIterable.of(2)).toExpression();
        when(expr.toString()).thenReturn("");

        visitor.visitDecimalExpr(expr);

        verify(newPrinter).print("1.5", "1.5");
    }

}