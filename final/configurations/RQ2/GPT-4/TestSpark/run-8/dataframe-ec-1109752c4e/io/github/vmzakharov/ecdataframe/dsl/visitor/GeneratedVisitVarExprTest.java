package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpression varExpr = new VarExpression(null, "x");
        String output = PrettyPrintVisitor.exprToString(varExpr);
        assertEquals("x", output.trim());
    }

}