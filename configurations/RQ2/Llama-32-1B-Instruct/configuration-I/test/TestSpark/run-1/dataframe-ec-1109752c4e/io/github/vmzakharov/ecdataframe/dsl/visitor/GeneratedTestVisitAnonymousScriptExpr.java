package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor.PrettyPrintVisitorexprToString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitAnonymousScriptExpr {

    @InjectMocks
    private PrettyPrintVisitor prettyPrintVisitor;

    @Mock
    private Printer printer;

    @Test
    public void testVisitAnonymousScriptExpr() {
        Expression expr = new AnonymousScriptExpr(new ExprValue(10));

        when(exprToString(anyExpression())).thenReturn("( x )");

        prettyPrintVisitor.visitAnonymousScriptExpr(expr);
        verify(printer).exprToString(expr);
    }

}