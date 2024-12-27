package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
        // Validate logic
    }

}