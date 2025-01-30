package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr(new ExprContext(), "property1.property2");
        assertEquals("property1.property2", PrettyPrintVisitor.exprToString(propertyPathExpr));
    }

}