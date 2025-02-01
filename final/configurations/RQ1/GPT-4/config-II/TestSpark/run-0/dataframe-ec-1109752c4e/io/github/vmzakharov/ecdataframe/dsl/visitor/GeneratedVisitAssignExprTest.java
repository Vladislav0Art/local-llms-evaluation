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

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr exprMock = mock(AssingExpr.class);
        when(exprMock.getVarName()).thenReturn("variable1");
        when(exprMock.isEscaped()).thenReturn(true);
        when(exprMock.getExpression()).thenReturn(new LongConst(42));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(exprMock);
        Assert.assertEquals("${variable1} = 42", visitor.toString());
    }

}