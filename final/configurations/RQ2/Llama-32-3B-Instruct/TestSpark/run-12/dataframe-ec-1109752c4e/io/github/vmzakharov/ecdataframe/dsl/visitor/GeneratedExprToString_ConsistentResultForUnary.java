package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedExprToString_ConsistentResultForUnary {

    private final Printer printer = new CollectingPrinter();

    @Test
    public void exprToString_ConsistentResultForUnary() {
        Expression e = new UnaryExpr(new VarExpr("x"), "+");
        String expected = "+ x";
        String result = PrettyPrintVisitor.exprToString(e);
        assertThat(result, is(expected));
    }

}