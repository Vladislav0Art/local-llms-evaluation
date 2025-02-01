package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assingExpr = mock(AssingExpr.class);
        assingExpr.visit(new PrettyPrintVisitor(assingExpr, false));
        String expectResult = "${AssignExpr}";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(assingExpr));
    }

}