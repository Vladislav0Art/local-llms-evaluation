package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        StringValue value = new StringValue("value");
        String result = PrettyPrintVisitor.exprToString(value);
        Assert.assertEquals("'value'", result);
    }

}