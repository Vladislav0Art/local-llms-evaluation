package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        ConstExpr constExpr = new ConstExpr(new StringValue("test"));
        assertEquals("\"test\"", PrettyPrintVisitor.exprToString(constExpr));
    }

}