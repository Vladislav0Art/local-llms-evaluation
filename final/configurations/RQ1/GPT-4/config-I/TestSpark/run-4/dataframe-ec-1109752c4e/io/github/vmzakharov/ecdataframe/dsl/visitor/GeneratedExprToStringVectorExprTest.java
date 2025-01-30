package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringVectorExprTest {

    @Test
    public void exprToStringVectorExprTest() {
        VectorExpr vectorExpr = new VectorExpr(null,
                Lists.immutable.of(new ConstBool(null, true),
                        new ConstBool(null, false),
                        new ConstBool(null, true)));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        vectorExpr.accept(prettyPrinter);
        Assert.assertEquals("(true, false, true)", printer.toString());
    }

}