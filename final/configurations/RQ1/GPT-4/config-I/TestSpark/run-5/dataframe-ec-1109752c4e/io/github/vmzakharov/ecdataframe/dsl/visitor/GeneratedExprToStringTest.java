package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.BinaryOp;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = Mockito.mock(Expression.class);
        Mockito.doAnswer(invocationOnMock -> {
            PrettyPrintVisitor prettyPrintVisitor = (PrettyPrintVisitor) invocationOnMock.getArguments()[0];
            prettyPrintVisitor.visitVarExpr(() -> "mockVar");
            return null;
        }).when(e).accept(Mockito.any(PrettyPrintVisitor.class));

        Assert.assertEquals("mockVar", PrettyPrintVisitor.exprToString(e));
    }

}