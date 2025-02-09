package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = Mockito.mock(VarExpr.class);
        new PrettyPrintVisitor().visitVarExpr(varExpr);
    }

}