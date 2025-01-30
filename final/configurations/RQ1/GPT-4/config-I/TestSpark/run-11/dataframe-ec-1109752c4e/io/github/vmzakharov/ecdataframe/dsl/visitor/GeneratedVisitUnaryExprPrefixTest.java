package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprPrefixTest {

    @Test
    public void visitUnaryExprPrefixTest() {
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new StringExpression("testValue"));
        assertEquals("!('testValue')", PrettyPrintVisitor.exprToString(expr));
    }

}