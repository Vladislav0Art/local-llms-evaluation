package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression stringExpr = new StringValue("Hello");
        String result = PrettyPrintVisitor.exprToString(stringExpr);
        assertEquals("\"Hello\"", result);
    }

}