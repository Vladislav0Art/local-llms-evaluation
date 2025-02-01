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

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssignExpr assignExpr = new AssignExpr("var1", new LongValue(123L), false);
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        assignExpr.accept(prettyPrintVisitor);
        Assert.assertEquals("var1 = 123", prettyPrintVisitor.toString());
    }

}