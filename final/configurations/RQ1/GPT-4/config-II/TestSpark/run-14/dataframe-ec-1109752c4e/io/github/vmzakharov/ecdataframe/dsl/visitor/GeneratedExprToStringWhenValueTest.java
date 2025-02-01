package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringWhenValueTest {

    @Test
    public void exprToStringWhenValueTest() {
        DecimalValue decimalValue = new DecimalValue(BigDecimal.TEN);
        Assert.assertEquals("10", PrettyPrintVisitor.exprToString(decimalValue));
    }

}