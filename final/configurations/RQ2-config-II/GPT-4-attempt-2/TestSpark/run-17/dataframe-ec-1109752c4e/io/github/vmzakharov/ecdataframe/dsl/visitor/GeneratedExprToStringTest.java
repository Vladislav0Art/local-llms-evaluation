package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("test"), BinaryOp.ADD, new VarExpr("test2"));
        String exprString = PrettyPrintVisitor.exprToString(binaryExpr);
        Assert.assertEquals("test + test2", exprString);
    }

}