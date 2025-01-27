package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedExprToString_BinaryExpr_ReturnsCorrectlyFormedString {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_BinaryExpr_ReturnsCorrectlyFormedString() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), "+", new DecimalExpr(2));
        Expression expr = binaryExpr;
        when(exprToString(anyExpression())).thenReturn(binaryExpr.toString());
        assertThat(prettyPrintVisitor.exprToString(expr), is(binaryExpr.toString()));
    }

}