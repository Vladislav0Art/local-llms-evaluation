package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assingExpr = Mockito.mock(AssingExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitAssignExpr(assingExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}