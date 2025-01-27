package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedVisitAssignExpr_MultipleAssignments_ReturnsMultipleAssignments {

    @Test
    public void visitAssignExpr_MultipleAssignments_ReturnsMultipleAssignments() {
        AssigningExpr expr1 = new AssigningExpr(new VarExpr("x"), 1);
        AssigningExpr expr2 = new AssigningExpr(new VarExpr("y"), 2);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(new ListIterable<>(new ArrayList[]{expr1, expr2})).toString();
        assertThat(result, is("\"x\" := 1\ny := 2"));
    }

}