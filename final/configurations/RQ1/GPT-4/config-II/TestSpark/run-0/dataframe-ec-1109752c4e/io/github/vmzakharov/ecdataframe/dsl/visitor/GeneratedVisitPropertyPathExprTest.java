package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = new PropertyPathExpr("property1.property2.property3");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitPropertyPathExpr(expr);
        Assert.assertEquals("property1.property2.property3", visitor.toString());
    }

}