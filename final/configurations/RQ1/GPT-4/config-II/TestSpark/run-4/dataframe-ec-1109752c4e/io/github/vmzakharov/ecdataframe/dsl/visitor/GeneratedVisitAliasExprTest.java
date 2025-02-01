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

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr(new LongValue(123L), "alias1");
        String prettyPrint = PrettyPrintVisitor.exprToString(aliasExpr);
        Assert.assertEquals("alias1 : 123", prettyPrint);
    }

}