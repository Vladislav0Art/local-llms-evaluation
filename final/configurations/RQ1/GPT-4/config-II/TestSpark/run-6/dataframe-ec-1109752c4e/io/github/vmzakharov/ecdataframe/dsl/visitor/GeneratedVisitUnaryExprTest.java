package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = mock(UnaryExpr.class);
        unaryExpr.visit(new PrettyPrintVisitor(unaryExpr, false));
        String expectResult = "(UnaryExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(unaryExpr));
    }

}