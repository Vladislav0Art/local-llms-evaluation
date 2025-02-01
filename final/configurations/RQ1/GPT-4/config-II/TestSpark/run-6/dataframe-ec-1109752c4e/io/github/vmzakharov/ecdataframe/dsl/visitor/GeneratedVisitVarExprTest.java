package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = mock(VarExpr.class);
        varExpr.visit(new PrettyPrintVisitor(varExpr, false));
        String expectResult = "(VarExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(varExpr));
    }

}