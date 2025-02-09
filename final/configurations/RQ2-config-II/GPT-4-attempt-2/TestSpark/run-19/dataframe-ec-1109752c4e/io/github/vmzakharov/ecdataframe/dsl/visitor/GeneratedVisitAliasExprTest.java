package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = Mockito.mock(AliasExpr.class);
        new PrettyPrintVisitor().visitAliasExpr(aliasExpr);
    }

}