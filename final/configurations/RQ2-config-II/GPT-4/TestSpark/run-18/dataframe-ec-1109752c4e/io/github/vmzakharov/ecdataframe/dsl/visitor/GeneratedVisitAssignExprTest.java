package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.mockito.ArgumentCaptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static io.github.vmzakharov.ecdataframe.dsl.BinaryOp.ADD;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVisitAssignExprTest {

    @Mock
    Printer mockPrinter;

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(mockPrinter);
        AssingExpr assignExpr = new AssingExpr(null, "x", new DecimalExpr(null, 5));

        visitor.visitAssignExpr(assignExpr);
        ArgumentCaptor<String> valueCapture = ArgumentCaptor.forClass(String.class);
        verify(mockPrinter, times(3)).print(valueCapture.capture());

        assertEquals("x", valueCapture.getAllValues().get(0));
        assertEquals(" = ", valueCapture.getAllValues().get(1));
        assertEquals("5", valueCapture.getAllValues().get(2));
    }

}