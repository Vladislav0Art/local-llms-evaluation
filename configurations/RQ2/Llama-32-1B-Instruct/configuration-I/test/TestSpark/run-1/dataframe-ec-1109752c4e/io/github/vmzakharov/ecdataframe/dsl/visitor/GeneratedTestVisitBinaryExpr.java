package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitBinaryExpr {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitBinaryExpr() {
        Expression expr = new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new ExprValue("+", new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("a = + (3 * 4)");

        prettyPrintVisitor.visitBinaryExpr(expr);
        verify(printer).exprToString(expr);
    }

}