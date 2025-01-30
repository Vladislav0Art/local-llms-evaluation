package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedVisitAssignExprTest {

    private static final VarExpr VAR_EXPR = new VarExpr("variable", false);

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr("var", false, VAR_EXPR);
        String expected = "var = variable";
        String actual = PrettyPrintVisitor.exprToString(assignExpr);
        assertEquals(expected, actual);
    }

}