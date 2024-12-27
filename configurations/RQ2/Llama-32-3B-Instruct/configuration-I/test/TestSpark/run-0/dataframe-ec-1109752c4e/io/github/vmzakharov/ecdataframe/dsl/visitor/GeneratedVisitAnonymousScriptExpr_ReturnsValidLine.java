package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitAnonymousScriptExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitAnonymousScriptExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("function(x) { return x * 2 }");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitAnonymousScriptExpr(new AnonymousScriptExpression("x", "return x * 2"));
        assertEquals("function(x) { return x * 2 }", result);
    }

}