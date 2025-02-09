package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        Printer printer = new CollectingPrinter();
        FunctionCallExpr expr = new FunctionCallExpr("testFunc", new FastList<>());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitFunctionCallExpr(expr);
        Assert.assertEquals("testFunc()", printer.toString());
    }

}