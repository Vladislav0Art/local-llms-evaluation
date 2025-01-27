package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedVisitAssignExprVisitorShouldPrintAssignmentTest {

    @Test
    public void visitAssignExprVisitorShouldPrintAssignmentTest() {
        AssigningExpr assigningExpr = new AssigningExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(assigningExpr);
        assertTrue(String.contains("=", visitor.getPrinter().toString()));
    }

}