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
public class GeneratedExprToStringTest {

    @Mock
    Printer mockPrinter;

    @Test
    public void exprToStringTest() {
        BinaryExpr expr = new BinaryExpr(null, ADD, new DecimalExpr(null, 5),
                new DecimalExpr(null, 6));
        assertEquals("5 + 6", PrettyPrintVisitor.exprToString(expr));
    }

}