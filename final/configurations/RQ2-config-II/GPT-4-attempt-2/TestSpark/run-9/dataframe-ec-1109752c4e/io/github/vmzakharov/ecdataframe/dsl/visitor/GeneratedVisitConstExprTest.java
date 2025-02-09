package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        StringValue expr = new StringValue("test");
        assertEquals("test", PrettyPrintVisitor.exprToString(expr));
    }

}