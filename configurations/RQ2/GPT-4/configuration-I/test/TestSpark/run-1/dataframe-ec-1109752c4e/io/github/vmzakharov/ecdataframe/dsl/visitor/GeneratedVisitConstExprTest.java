package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value expr = new Value();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(expr);
        // Validate logic
    }

}