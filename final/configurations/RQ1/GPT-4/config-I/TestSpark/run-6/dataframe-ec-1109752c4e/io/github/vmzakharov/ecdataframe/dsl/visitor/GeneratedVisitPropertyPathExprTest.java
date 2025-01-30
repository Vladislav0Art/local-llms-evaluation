package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.operator.BinaryOperator;
import io.github.vmzakharov.ecdataframe.dsl.operator.UnaryOperator;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("some.property.path");
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        propertyPathExpr.accept(prettyPrintVisitor);
        assertEquals("some.property.path", prettyPrintVisitor.toString());
    }

}