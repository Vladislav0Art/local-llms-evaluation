package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedExprToString_EmptyExpression_ReturnsEmptyString {

    @Test
    public void exprToString_EmptyExpression_ReturnsEmptyString() {
        Expression e = new Expression();
        String result = PrettyPrintVisitor.exprToString(e);
        assertThat(result, is(""));
    }

}