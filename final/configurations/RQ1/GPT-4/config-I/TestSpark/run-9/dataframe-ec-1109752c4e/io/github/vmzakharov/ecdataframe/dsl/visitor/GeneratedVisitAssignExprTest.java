package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframework.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframework.dsl.value.Value;
import io.github.vmzakharov.ecdataframework.dsl.visitor.PrettyPrintVisitor;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Value valueMock = Mockito.mock(Value.class);
        when(valueMock.asStringLiteral()).thenReturn("100");
        AssignExpr assignExprMock = new AssignExpr("variable", valueMock);

        String result = PrettyPrintVisitor.exprToString(assignExprMock);

        Assert.assertEquals("variable = 100", result);
    }

}