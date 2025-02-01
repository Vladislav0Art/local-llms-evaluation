package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.utility.StringIterate;
import org.eclipse.collections.impl.utility.ArrayIterate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void VisitAssignExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAssignExpr(new AssingExpr("a", Value.of(1), false));
        Assert.assertEquals("a = 1", printer.toString());
    }

}