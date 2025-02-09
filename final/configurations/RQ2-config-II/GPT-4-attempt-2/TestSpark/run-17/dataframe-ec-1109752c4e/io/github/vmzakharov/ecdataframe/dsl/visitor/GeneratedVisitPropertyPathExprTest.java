package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        Printer printer = new CollectingPrinter();
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("var"), "property");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitPropertyPathExpr(expr);
        Assert.assertEquals("var.property", printer.toString());
    }

}