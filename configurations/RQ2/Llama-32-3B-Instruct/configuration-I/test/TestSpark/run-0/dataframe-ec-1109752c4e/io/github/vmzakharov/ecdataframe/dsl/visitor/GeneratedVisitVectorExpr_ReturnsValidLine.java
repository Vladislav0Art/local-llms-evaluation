package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitVectorExpr_ReturnsValidLine {

    @Mock
    private Printer printer;

    @Test
    public void visitVectorExpr_ReturnsValidLine() {
        when(printer.print(anyString())).thenReturn("[1, 2, 3]");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        String result = visitor.visitVectorExpr(new VectorExpression(1, 2, 3));
        assertEquals("[1, 2, 3]", result);
    }

}