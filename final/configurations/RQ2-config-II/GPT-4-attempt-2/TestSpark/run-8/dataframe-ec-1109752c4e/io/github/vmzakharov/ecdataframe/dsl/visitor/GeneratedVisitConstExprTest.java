package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        Value value = Value.newValue(20);
        visitor.visitConstExpr(value);
        Assert.assertEquals("20", visitor.toString());
    }

}