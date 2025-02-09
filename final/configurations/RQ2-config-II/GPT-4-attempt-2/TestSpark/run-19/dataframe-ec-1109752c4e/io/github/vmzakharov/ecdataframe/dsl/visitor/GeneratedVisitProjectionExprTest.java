package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr projectionExpr = Mockito.mock(ProjectionExpr.class);
        new PrettyPrintVisitor().visitProjectionExpr(projectionExpr);
    }

}