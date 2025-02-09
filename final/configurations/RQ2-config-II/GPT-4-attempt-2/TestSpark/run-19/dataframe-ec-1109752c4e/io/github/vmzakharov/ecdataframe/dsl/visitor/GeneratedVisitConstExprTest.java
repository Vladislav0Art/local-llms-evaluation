package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value value = Mockito.mock(Value.class);
        new PrettyPrintVisitor().visitConstExpr(value);
    }

}