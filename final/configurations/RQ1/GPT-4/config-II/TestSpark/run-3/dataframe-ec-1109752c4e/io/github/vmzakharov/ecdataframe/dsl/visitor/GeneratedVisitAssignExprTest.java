package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static io.github.vmzakharov.ecdataframe.dsl.ExpressionParser.*;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Expression expression = toAssignmentExpression("a = 1");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("a = 1", printer.toString());
    }

}