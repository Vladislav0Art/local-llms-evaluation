package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

public class GeneratedVisitAssignExpr_SimpleAssignment_ReturnsSimpleAssignment {

    @Test
    public void visitAssignExpr_SimpleAssignment_ReturnsSimpleAssignment() {
        AssigningExpr expr = new AssigningExpr(new VarExpr("a"), 1);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String result = visitor.visit(expr).toString();
        assertThat(result, is("\"a\" := 1"));
    }

}