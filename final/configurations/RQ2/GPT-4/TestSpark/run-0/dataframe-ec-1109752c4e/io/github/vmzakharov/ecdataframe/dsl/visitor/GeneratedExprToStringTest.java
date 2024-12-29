package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = mock(Expression.class);
        CollectingPrinter printer = mock(CollectingPrinter.class);

        when(e.accept(any(PrettyPrintVisitor.class))).thenAnswer(i -> {
            Object[] args = i.getArguments();
            ((PrettyPrintVisitor) args[0]).visitVarExpr(e);
            return null;
        });
        when(e.asStringLiteral()).thenReturn("test");

        String result = PrettyPrintVisitor.exprToString(e);

        assertEquals("test", result);
    }

}