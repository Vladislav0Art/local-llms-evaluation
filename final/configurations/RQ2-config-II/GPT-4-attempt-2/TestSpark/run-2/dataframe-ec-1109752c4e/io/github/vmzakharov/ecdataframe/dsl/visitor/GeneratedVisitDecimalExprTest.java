package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = Mockito.mock(DecimalExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitDecimalExpr(expr);
        // Verify the interaction with mock object, depends on your implementation
    }

}