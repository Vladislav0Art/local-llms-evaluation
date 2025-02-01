package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static io.github.vmzakharov.ecdataframe.dsl.ExpressionParser.*;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        Expression expression = toPropertyPathExpression("object.property");
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("object.property", printer.toString());
    }

}