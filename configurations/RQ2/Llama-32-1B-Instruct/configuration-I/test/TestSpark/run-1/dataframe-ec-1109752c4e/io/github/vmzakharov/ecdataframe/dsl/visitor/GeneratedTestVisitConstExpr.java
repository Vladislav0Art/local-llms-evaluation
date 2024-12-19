package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitConstExpr {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitConstExpr() {
        Expression expr = new ConstExpr(new Value(10));
        when(exprToString(anyExpression())).thenReturn("10");

        prettyPrintVisitor.visitConstExpr(expr);
        verify(printer).exprToString(expr);
    }

}