package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitAliasExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitAliasExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("x as y");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitAliasExpr(new AliasExpression("x", "y"));
        assertEquals("x as y", result);
    }

}