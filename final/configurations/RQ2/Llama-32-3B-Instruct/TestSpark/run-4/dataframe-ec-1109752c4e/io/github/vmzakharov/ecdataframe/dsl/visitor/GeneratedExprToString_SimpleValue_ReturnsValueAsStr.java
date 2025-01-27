package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedExprToString_SimpleValue_ReturnsValueAsStr {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_SimpleValue_ReturnsValueAsStr() {
        Value value = new Value("value");
        Expression expr = new DecimalExpr(value);
        when(exprToString(anyExpression())).thenReturn(value.toString());
        assertThat(prettyPrintVisitor.exprToString(expr), is(value.toString()));
    }

}