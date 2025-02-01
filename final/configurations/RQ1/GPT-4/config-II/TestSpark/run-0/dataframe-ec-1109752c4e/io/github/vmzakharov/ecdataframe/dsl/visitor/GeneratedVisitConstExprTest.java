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

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value value = new DecimalValue("1.23");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(value);
        Assert.assertEquals("'1.23'", visitor.toString());
    }

}