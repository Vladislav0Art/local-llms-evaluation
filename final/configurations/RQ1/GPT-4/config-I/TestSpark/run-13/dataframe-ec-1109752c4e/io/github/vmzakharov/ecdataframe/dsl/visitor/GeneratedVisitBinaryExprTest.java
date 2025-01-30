package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedVisitBinaryExprTest {

    private static final VarExpr VAR_EXPR = new VarExpr("variable", false);

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(BinaryOp.ADDITION, VAR_EXPR, VAR_EXPR);
        String expected = "(variable + variable)";
        String actual = PrettyPrintVisitor.exprToString(binaryExpr);
        assertEquals(expected, actual);
    }

}