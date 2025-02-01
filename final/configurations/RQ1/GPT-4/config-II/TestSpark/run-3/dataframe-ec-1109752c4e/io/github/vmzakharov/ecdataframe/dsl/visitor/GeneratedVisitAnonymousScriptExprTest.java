package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static io.github.vmzakharov.ecdataframe.dsl.ExpressionParser.*;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        MutableList<Expression> expressions = Lists.mutable.of(toExpression("2 + 2"), toExpression("1 + 1"));
        AnonymousScript anonymousScript = new AnonymousScript(expressions);
        CollectingPrinter printer = new CollectingPrinter();
        anonymousScript.accept(new PrettyPrintVisitor(printer));
        Assert.assertEquals("(2 + 2)\n(1 + 1)\n", printer.toString());
    }

}