package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(collectingPrinter);
        StringValue stringValue = new StringValue("Test");
        prettyPrintVisitor.visitConstExpr(stringValue);
        Assert.assertEquals("Test", collectingPrinter.getBuffer().toString());
    }

}