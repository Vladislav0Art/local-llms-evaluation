package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = new PropertyPathExpr(null);
        CollectingPrinter printer = PrinterFactory.newCollectingPrinter();
        new PrettyPrintVisitor(printer).visitPropertyPathExpr(expr);

        assertEquals("", printer.asString());
    }

}