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

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = mock(FunctionCallExpr.class);
        when(expr.getFunctionName()).thenReturn("func1");
        when(expr.getParameters()).thenReturn(Lists.immutable.of(new VarExpr("arg1"), new VarExpr("arg2")));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);
        Assert.assertEquals("func1(arg1, arg2)", visitor.toString());
    }

}