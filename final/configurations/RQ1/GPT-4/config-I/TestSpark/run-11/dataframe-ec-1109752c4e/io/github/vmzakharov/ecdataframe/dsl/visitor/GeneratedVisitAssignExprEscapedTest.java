package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprEscapedTest {

    @Test
    public void visitAssignExprEscapedTest() {
        AssingExpr expr = new AssingExpr("varName", new StringExpression("testValue"));
        expr.setEscaped(true);
        assertEquals("${varName} = 'testValue'", PrettyPrintVisitor.exprToString(expr));
    }

}