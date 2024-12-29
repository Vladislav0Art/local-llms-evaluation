package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testVisitAssignExpr() {
        AssingExpr expr = Mockito.mock(AssingExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
    }

    @Test
    public void testVisitBinaryExpr() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
    }

    @Test
    public void testVisitUnaryExpr() {
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);
    }

    @Test
    public void testVisitConstExpr() {
        Value expr = Mockito.mock(Value.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(expr);
    }

}