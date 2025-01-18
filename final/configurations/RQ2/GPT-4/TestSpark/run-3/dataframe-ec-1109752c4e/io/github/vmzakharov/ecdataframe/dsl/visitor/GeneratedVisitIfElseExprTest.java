package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = Mockito.mock(IfElseExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitIfElseExpr(ifElseExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}