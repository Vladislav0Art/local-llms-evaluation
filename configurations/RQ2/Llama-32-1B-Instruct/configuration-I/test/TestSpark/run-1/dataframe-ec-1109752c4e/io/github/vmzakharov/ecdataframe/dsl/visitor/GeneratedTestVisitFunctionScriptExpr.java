package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitFunctionScriptExpr {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitFunctionScriptExpr() {
        Expression expr = new FunctionScriptExpr(new BinaryExpr(new AssignExpr(new ExprValue("x", 5), new UnaryExpr(new Value(4)))));

        when(exprToString(anyExpression())).thenReturn("( x + (3 * 4) )");

        prettyPrintVisitor.visitFunctionScriptExpr(expr);
        verify(printer).exprToString(expr);
    }

}