package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        ProjectionExpr expr = new ProjectionExpr(new VarExpr("v", false), "attribute");
        expr.accept(visitor);

        when(printer.asString()).thenReturn("v.attribute");
        assertEquals("v.attribute", printer.asString());
    }

}