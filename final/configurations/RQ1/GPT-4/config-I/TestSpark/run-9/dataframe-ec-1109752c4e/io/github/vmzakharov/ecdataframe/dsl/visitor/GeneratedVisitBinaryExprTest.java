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

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Value leftValueMock = Mockito.mock(Value.class);
        when(leftValueMock.asStringLiteral()).thenReturn("10");
        Value rightValueMock = Mockito.mock(Value.class);
        when(rightValueMock.asStringLiteral()).thenReturn("20");
        BinaryExpr binaryExprMock = new BinaryExpr(leftValueMock, Operation.ADD, rightValueMock);

        String result = PrettyPrintVisitor.exprToString(binaryExprMock);

        Assert.assertEquals("(10 + 20)", result);
    }

}