package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitConstExpr {

    @Test
    public void visitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value value = mock(Value.class);
        when(value.toString()).thenReturn("5");
        visitor.visitConstExpr(value);
        verify(value, times(1)).toString();
    }

}