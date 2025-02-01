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

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = new IndexExpr(new VarExpr("vectorVar1"), new LongValue(5L));
        String prettyPrint = PrettyPrintVisitor.exprToString(indexExpr);
        Assert.assertEquals("vectorVar1[5]", prettyPrint);
    }

}