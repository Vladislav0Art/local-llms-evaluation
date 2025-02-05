package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        // Arrange
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), BinaryOp.ADD, new DecimalExpr(new BigDecimal("10")));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        prettyPrintVisitor.visitBinaryExpr(expr);
        // Assert
        assertEquals(prettyPrintVisitor.exprToString(expr), "a + 10");
    }

}