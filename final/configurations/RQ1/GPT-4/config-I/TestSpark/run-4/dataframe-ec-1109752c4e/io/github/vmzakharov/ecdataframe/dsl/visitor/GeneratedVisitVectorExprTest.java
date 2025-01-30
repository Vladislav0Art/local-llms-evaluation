package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        ListIterable<Expression> expressions = Lists.immutable.of(new ConstExpr(null, Value.stringValueOf("true")),
                new ConstExpr(null, Value.stringValueOf("false")),
                new ConstExpr(null, Value.stringValueOf("true")));

        VectorExpr vectorExpr = new VectorExpr(null, expressions);
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        vectorExpr.accept(prettyPrinter);
        Assert.assertEquals("(\"true\", \"false\", \"true\")", printer.toString());
    }

}