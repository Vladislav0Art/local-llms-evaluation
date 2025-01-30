package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript.FunctionMethod;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitProjectionExpr(new ProjectionExpr(
                        Lists.immutable.of(
                                new AliasExpr("alias", new ValueExpr(Value.newInt(10))),
                                new AliasExpr("alias2", new ValueExpr(Value.newInt(20)))
                        ),
                        null));

        Assert.assertEquals("project {alias : 10, alias2 : 20}", printer.toString());
    }

}