package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedVisitBinaryExpr_NestedBinaryOperation_ReturnsNestedBinaryOperation {

    @Test
    public void visitBinaryExpr_NestedBinaryOperation_ReturnsNestedBinaryOperation() {
        BinaryExpr expr1 = new BinaryExpr(new VarExpr("x"), Operator.ADD, new ConstExpr(2));
        BinaryExpr expr2 = new BinaryExpr(expr1, Operator.ADD, new ConstExpr(3));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(new ListIterable<>(new ArrayList[]{expr1, expr2})).toString();
        assertThat(result, is("\"x\" + 2 + 3"));
    }

}