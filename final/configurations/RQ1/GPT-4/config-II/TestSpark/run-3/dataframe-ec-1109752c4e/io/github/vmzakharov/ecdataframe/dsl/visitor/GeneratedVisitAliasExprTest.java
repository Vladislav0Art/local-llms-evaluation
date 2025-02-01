package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static io.github.vmzakharov.ecdataframe.dsl.ExpressionParser.*;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = new AliasExpr("alias", toFunctionCallExpression("sum(a, b)"));
        CollectingPrinter printer = new CollectingPrinter();
        aliasExpr.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("alias : sum(a, b)", printer.toString());
    }

}