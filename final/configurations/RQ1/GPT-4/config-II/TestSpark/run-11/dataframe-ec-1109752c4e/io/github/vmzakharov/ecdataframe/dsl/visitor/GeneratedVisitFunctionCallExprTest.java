package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.IfElseExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        FunctionCallExpr expr = Mockito.mock(FunctionCallExpr.class);
        Mockito.when(expr.getFunctionName()).thenReturn("testFunc");

        visitor.visitFunctionCallExpr(expr);

        Mockito.verify(mockPrinter).print("testFunc()");
    }

}