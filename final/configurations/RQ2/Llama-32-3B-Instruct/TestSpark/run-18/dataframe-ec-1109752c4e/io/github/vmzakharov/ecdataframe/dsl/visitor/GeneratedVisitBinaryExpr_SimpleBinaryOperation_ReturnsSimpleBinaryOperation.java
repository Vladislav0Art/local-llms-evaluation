package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedVisitBinaryExpr_SimpleBinaryOperation_ReturnsSimpleBinaryOperation {

    @Test
    public void visitBinaryExpr_SimpleBinaryOperation_ReturnsSimpleBinaryOperation() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), Operator.ADD, new ConstExpr(5));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertThat(result, is("\"a\" + 5"));
    }

}