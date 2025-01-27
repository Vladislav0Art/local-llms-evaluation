package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedExprToString_EmptyExpr_ReturnsEmptyString {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_EmptyExpr_ReturnsEmptyString() {
        Expression expr = mock(Expression.class);
        when(exprToString(anyExpression())).thenReturn("");
        assertThat(prettyPrintVisitor.exprToString(expr), is(""));
    }

}