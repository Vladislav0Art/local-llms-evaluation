package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        // Arrange
        DecimalExpr expr = new DecimalExpr(new BigDecimal("10"));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        // Act
        String result = prettyPrintVisitor.exprToString(expr);
        // Assert
        assertEquals(result, "10");
    }

}