package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = mock(IfElseExpr.class);
        ifElseExpr.visit(new PrettyPrintVisitor(ifElseExpr, false));
        String expectResult = "(IfElseExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(ifElseExpr));
    }

}