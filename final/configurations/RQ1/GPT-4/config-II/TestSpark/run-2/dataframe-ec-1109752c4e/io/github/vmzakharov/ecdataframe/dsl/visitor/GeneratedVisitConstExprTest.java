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

public class GeneratedVisitConstExprTest {

    @Test
    public void VisitConstExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitConstExpr(Value.of("abc"));
        Assert.assertEquals("'abc'", printer.toString());
    }

}