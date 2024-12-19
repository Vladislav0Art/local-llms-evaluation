package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitProjectionExpr {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitProjectionExpr() {
        Expression expr = new ProjectionExpr(new AssignExpr(new ExprValue("a", 3), new AssignExpr(new ExprValue("b", 4))));

        when(exprToString(anyExpression())).thenReturn("( a . b )");

        prettyPrintVisitor.visitProjectionExpr(expr);
        verify(printer).exprToString(expr);
    }

}