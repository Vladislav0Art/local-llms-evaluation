package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedExprToString_ConstExpr_ReturnsConstExprValue {

    @Test
    public void exprToString_ConstExpr_ReturnsConstExprValue() {
        Value value = new Value("10");
        Expression e = new ConstExpr(value);
        String result = PrettyPrintVisitor.exprToString(e);
        assertThat(result, is("\"10\""));
    }

}