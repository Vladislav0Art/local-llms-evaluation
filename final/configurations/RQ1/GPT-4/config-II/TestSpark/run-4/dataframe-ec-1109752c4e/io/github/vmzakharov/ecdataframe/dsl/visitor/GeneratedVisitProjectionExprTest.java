package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.LongValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.UnaryOpString;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr projectionExpr = new ProjectionExpr(Lists.mutable.of(new LongValue(369L)));
        String prettyPrint = PrettyPrintVisitor.exprToString(projectionExpr);
        Assert.assertEquals("project {369}", prettyPrint);
    }

}