package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionScriptExpr {

    @Test
    public void visitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript script = mock(FunctionScript.class);
        when(script.toString()).thenReturn("x + y");
        visitor.visitFunctionScriptExpr(script);
        verify(script, times(1)).toString();
    }

}