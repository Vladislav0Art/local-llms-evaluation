package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedExprToString_ConsistentResultForBinary {

    private final Printer printer = new CollectingPrinter();

    @Test
    public void exprToString_ConsistentResultForBinary() {
        Expression e = new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(2));
        String expected = "x + 2";
        String result = PrettyPrintVisitor.exprToString(e);
        assertThat(result, is(expected));
    }

}