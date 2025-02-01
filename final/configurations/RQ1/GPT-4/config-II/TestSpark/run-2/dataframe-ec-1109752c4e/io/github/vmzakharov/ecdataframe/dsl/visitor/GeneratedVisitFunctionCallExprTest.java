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

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void VisitFunctionCallExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitFunctionCallExpr(new FunctionCallExpr("foo", Lists.mutable.of(Value.of(1), Value.of(2))));
        Assert.assertEquals("foo(1, 2)", printer.toString());
    }

}