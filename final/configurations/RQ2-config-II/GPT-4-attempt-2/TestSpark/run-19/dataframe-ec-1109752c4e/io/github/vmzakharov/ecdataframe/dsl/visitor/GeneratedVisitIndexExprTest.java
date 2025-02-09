package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = Mockito.mock(IndexExpr.class);
        new PrettyPrintVisitor().visitIndexExpr(indexExpr);
    }

}