package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assingExpr = new AssingExpr(null, "x", new ConstExpr(new StringValue("test")), false);
        assertEquals("x = \"test\"", PrettyPrintVisitor.exprToString(assingExpr));
    }

}