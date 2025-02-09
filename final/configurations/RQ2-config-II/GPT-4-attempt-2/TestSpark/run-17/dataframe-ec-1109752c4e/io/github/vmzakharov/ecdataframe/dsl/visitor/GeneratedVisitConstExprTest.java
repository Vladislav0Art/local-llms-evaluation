package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Printer printer = new CollectingPrinter();
        Value value = mock(Value.class);
        when(value.asStringLiteral()).thenReturn("5");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitConstExpr(value);
        Assert.assertEquals("5", printer.toString());
    }

}