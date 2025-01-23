package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
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
        AssingExpr mockAssingExpr = mock(AssingExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitAssignExpr(mockAssingExpr);
    }

    @Test
    public void testVisitBinaryExpr() {
        BinaryExpr mockBinaryExpr = mock(BinaryExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitBinaryExpr(mockBinaryExpr);
    }

    @Test
    public void testVisitUnaryExpr() {
        UnaryExpr mockUnaryExpr = mock(UnaryExpr.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitUnaryExpr(mockUnaryExpr);
    }

    @Test
    public void testVisitConstExpr() {
        Value mockValue = mock(Value.class);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitConstExpr(mockValue);
    }

}