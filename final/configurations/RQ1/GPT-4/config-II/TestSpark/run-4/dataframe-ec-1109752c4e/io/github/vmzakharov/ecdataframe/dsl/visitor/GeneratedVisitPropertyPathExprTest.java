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

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("path1.path2.path3");
        String prettyPrint = PrettyPrintVisitor.exprToString(propertyPathExpr);
        Assert.assertEquals("path1.path2.path3", prettyPrint);
    }

}