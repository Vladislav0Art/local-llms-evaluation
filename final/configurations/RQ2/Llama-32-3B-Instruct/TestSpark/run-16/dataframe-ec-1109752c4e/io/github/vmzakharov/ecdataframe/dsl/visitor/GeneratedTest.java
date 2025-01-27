package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void exprToString_EmptyExpression_ReturnsEmptyString() {
        Expression e = new Expression();
        assertEquals("", exprToString(e));
    }

    @Test
    public void exprToString_ExpressionWithVariable_ReturnsVariableName() {
        Expression e = new VarExpr("x");
        assertEquals("x", exprToString(e));
    }

    @Test
    public void exprToString_ConstantExpression_ReturnsConstantValue() {
        Expression e = new DecimalExpr(1);
        assertEquals("1", exprToString(e));
    }

    @Test
    public void visitAssignExpr_AssignExpressionPrintedCorrectly() {
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new BinaryExpr(new VarExpr("y"), "+", 2));
        visitor.visit(expr);
    }

    @Test
    public void visitBinaryExpr_BinaryExpressionPrintedCorrectly() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(2));
        visitor.visit(expr);
    }

    @Test
    public void visitUnaryExpr_UnaryExpressionPrintedCorrectly() {
        UnaryExpr expr = new UnaryExpr(new VarExpr("x"), "-");
        visitor.visit(expr);
    }

    private String exprToString(Expression e) {
        PrettyPrintVisitor.PrettyPrintVisitor printer = new PrettyPrintVisitor();
        printer.visit(e);
        return printer.getPrinter().toString();
    }
}

@Test
public void toString_PrinterToString() {
    assertEquals(printer.toString(), printer.toString());
}

@Test
public void toString_EmptyString_ReturnsEmptyString() {
    printer.clear();
    assertEquals("", printer.toString());
}
	}

@Test
public void createPrinter_PrinterCreatedCorrectly() {
    Printer printer = factory.createPrinter();
    assertNotNull(printer);
}

@Test
public void getPrinterType_PrinterIsCollected() {
    Printer printer = factory.createPrinter();
    assertEquals(Printer.Collecting.class, printer.getClass());
}
	}

@Test
public void getVariableName_VariableNameReturnedCorrectly() {
    assertEquals("x", expression.getVariableName());
}

@Test
public void getConstantValue_ConstantValueReturnedCorrectly() {
    assertEquals(2, expression.getConstantValue());
}

}