package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedExprToStringAliasExprTest {

    @Test
    public void exprToStringAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr(new Expression());
        String result = PrettyPrintVisitor.exprToString(aliasExpr);
        assertThat(result, is("Alias(Expression)"));
    }

}