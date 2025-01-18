package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = Mockito.mock(UnaryExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitUnaryExpr(unaryExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}