package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = new Value("Test Value");
        String result = PrettyPrintVisitor.exprToString(e);
        Assert.assertEquals("expected", result);
    }

}