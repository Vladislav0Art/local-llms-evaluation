package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.Expression;

public class GeneratedVisitConstExprVisitorShouldPrintConstantValueTest {

    @Test
    public void visitConstExprVisitorShouldPrintConstantValueTest() {
        Value value = new Value();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(value);
        assertTrue(String.contains(String.valueOf(value), visitor.getPrinter().toString()));
    }

}