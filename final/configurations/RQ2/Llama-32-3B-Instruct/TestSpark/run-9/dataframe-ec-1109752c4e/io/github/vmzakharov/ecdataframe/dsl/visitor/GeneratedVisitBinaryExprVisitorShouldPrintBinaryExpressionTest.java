package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedVisitBinaryExprVisitorShouldPrintBinaryExpressionTest {

    @Test
    public void visitBinaryExprVisitorShouldPrintBinaryExpressionTest() {
        BinaryExpr binaryExpr = new BinaryExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(binaryExpr);
        assertTrue(String.contains("+", visitor.getPrinter().toString()));
    }

}