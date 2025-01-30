package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringBasicTest {

    @Test
    public void exprToStringBasicTest() {
        AssingExpr assignExpr = new AssingExpr("a", false, new StringValue("b"));
        String result = PrettyPrintVisitor.exprToString(assignExpr);
        assertEquals("a = \"b\"", result);
    }

}