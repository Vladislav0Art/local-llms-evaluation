package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Printer printer = new CollectingPrinter();
        BinaryExpr expr = new BinaryExpr(new VarExpr("test"), BinaryOp.ADD, new VarExpr("test2"));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitBinaryExpr(expr);
        Assert.assertEquals("test + test2", printer.toString());
    }

}