package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        DecimalValue constExprMock = Mockito.mock(DecimalValue.class);
        Printer printer = new CollectingPrinter();

        new PrettyPrintVisitor(printer).visitConstExpr(constExprMock);

        assertEquals("ConstExpr", printer.toString());
    }

}