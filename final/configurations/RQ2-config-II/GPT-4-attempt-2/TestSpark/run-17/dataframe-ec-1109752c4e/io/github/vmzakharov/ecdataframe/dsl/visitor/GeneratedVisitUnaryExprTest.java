package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        Printer printer = new CollectingPrinter();
        UnaryExpr expr = new UnaryExpr(UnaryOp.MINUS, new VarExpr("test"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals("-test", printer.toString());
    }

}