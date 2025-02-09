package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), BinaryOp.ADD, new StringValue("1"));
        assertEquals("a + 1", PrettyPrintVisitor.exprToString(expr));
    }

}