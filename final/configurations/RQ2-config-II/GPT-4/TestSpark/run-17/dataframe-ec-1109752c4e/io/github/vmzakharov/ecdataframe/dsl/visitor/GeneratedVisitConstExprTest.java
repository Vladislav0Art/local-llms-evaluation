package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        Value value = DecimalValue.newDecimalValue(new BigDecimal(123.45));
        visitor.visitConstExpr(value);
        Assert.assertEquals("123.45", collectingPrinter.getBufferAsString());
    }

}