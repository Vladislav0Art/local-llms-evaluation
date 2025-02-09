package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        Printer printer = new CollectingPrinter();
        AssingExpr expr = new AssingExpr("varName", new VarExpr("testVar"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAssignExpr(expr);
        Assert.assertEquals("varName = testVar;\n", printer.toString());
    }

}