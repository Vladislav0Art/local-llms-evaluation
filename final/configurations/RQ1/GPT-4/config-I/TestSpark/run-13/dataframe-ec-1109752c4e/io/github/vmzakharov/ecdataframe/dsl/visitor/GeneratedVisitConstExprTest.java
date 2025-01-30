package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value value = Value.newValue(5.0);
        PrettyPrintVisitor.visitor.visitConstExpr(value);
        assertEquals("5", visitor.printer.toString());
    }

}