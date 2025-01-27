package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestVisitVarExpression {

    @Mock
    private Printer newPrinter;

    public void testConstructor() {
        // test constructor call
    }

    public void testVisitAssignExpr() {
        AssingExpr expr = new AssingExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        visitor.visitAssignExpr(expr);
        // test visitAssignExpr method
    }

    public void testVisitBinaryExpr_SimpleExpression() {
        BinaryExpr expr = new BinaryExpr(1, 2);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        visitor.visitBinaryExpr(expr);
        // test visitBinaryExpr with simple expression
    }

    public void testVisitBinaryExpr_ComplexExpression() {
        BinaryExpr expr = new BinaryExpr(new BinaryExpr(1, 2), "+");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        visitor.visitBinaryExpr(expr);
        // test visitBinaryExpr with complex expression
    }

    @Test
    public void testVisitVarExpression() {
        VarExpr expr = new VarExpr("varName");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(newPrinter);
        String result = visitor.exprToString(expr);
        assertEquals("[VarExpr]{name varName}", result);
        // test visitVarExpression method
    }

}