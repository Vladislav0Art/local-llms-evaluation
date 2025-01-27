package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedExprToStringExpressionTest {

    @Test
    public void exprToStringExpressionTest() {
        Expression expression = new Expression();
        String result = PrettyPrintVisitor.exprToString(expression);
        assertThat(result, is("Expression"));
    }

}