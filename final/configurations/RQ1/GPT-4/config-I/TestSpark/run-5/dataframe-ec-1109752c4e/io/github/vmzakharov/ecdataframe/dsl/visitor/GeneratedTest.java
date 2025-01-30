package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.StatementSequenceScript;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.IfElseExpr;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.eclipse.collections.impl.factory.Lists;

public class GeneratedTest {

    private static final String NEWLINE = System.lineSeparator();

    @Test
    public void exprToStringTest() {
        Expression e = Mockito.mock(Expression.class);
        Mockito.doAnswer(invocationOnMock -> {
            PrettyPrintVisitor prettyPrintVisitor = (PrettyPrintVisitor) invocationOnMock.getArguments()[0];
            prettyPrintVisitor.visitConstExpr(new StringValue("test"));
            return null;
        }).when(e).accept(Mockito.any(PrettyPrintVisitor.class));

        Assert.assertEquals("\"test\"", PrettyPrintVisitor.exprToString(e));
    }

    @Test
    public void visitConstExprTest() {
        StringValue stringValue = new StringValue("test");
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitConstExpr(stringValue);
        Assert.assertEquals("\"test\"", printer.toString());
    }

}