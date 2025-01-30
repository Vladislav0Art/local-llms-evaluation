package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedVisitFunctionCallExprTest {

    private static final VarExpr VAR_EXPR = new VarExpr("variable", false);

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("testFun", FastList.newListWith(VAR_EXPR));
        String expected = "testFun(variable)";
        String actual = PrettyPrintVisitor.exprToString(functionCallExpr);
        assertEquals(expected, actual);
    }

}