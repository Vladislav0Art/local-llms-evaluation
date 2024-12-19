package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitVectorExpr {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitVectorExpr() {
        Expression expr = new VectorExpr(new AssignExpr(new ExprValue("x", 5), new BinaryExpr(new AssignExpr(new ExprValue("a", 3), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x [ a + (3 * 4) ]");

        prettyPrintVisitor.visitVectorExpr(expr);
        verify(printer).exprToString(expr);
    }

}