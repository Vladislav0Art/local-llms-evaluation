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

public class GeneratedVisitAssignExprEscapeNeededTest {

    @Test
    public void visitAssignExprEscapeNeededTest() {
        Printer mockPrinter = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);

        AssingExpr expr = Mockito.mock(AssingExpr.class);
        Mockito.when(expr.isEscaped()).thenReturn(true);
        Mockito.when(expr.getVarName()).thenReturn("varName");
        Mockito.when(expr.getExpression()).thenReturn(Mockito.mock(Expression.class));

        visitor.visitAssignExpr(expr);

        Mockito.verify(mockPrinter).print("${varName} = ");
    }

}