package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssigningExpr expr = new AssigningExpr() {
            @Override
            public String toString() {
                return "testAssignExpr";
            }
        };
        when(expr.toString()).thenReturn("testAssignExpr");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
        assertEquals("testAssignExpr", expr.toString());
    }

}