package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new VarExpr("a"));
        assertEquals("!a", PrettyPrintVisitor.exprToString(expr));
    }

}