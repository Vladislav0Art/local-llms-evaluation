package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprBasicTest {

    @Test
    public void visitUnaryExprBasicTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, new StringValue("b"));
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        assertEquals("!(\"b\")", printer.toString());
    }

}