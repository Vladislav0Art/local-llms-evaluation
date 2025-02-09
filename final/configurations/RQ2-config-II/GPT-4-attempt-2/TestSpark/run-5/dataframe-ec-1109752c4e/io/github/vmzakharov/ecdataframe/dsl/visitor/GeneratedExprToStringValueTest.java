package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.SimpleValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringValueTest {

    @Test
    public void exprToStringValueTest() {
        SimpleValue simpleValue = new SimpleValue("testValue");
        String result = PrettyPrintVisitor.exprToString(simpleValue);
        assertEquals("testValue", result);
    }

}