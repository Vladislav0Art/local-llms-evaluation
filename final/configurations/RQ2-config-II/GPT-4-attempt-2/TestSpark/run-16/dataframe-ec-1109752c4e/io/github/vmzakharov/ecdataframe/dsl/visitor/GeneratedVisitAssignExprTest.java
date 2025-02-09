package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssignExpr assignExpr = new AssignExpr(new VarExpr("var"), new Value("value"));
        assertEquals("var = value", PrettyPrintVisitor.exprToString(assignExpr));
    }

}