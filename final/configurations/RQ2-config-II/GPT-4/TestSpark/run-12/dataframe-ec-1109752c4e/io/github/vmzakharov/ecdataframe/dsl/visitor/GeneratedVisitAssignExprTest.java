package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        // Arrange
        AssingExpr expr = new AssingExpr(new VarExpr("a"), new DecimalExpr(new BigDecimal("10")));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        prettyPrintVisitor.visitAssignExpr(expr);
        // Assert
        assertEquals(prettyPrintVisitor.exprToString(expr), "a = 10");
    }

}