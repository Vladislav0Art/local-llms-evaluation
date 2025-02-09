package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = Mockito.mock(IfElseExpr.class);
        new PrettyPrintVisitor().visitIfElseExpr(ifElseExpr);
    }

}