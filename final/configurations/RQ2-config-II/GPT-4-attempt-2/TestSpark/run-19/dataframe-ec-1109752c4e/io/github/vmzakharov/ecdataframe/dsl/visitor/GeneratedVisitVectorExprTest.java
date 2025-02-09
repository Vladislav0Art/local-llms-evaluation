package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = Mockito.mock(VectorExpr.class);
        new PrettyPrintVisitor().visitVectorExpr(vectorExpr);
    }

}