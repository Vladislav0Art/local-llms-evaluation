package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        // Arrange
        UnaryExpr expr = new UnaryExpr(UnaryOp.MINUS, new VarExpr("a"));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        prettyPrintVisitor.visitUnaryExpr(expr);
        // Assert
        assertEquals(prettyPrintVisitor.exprToString(expr), "-a");
    }

}