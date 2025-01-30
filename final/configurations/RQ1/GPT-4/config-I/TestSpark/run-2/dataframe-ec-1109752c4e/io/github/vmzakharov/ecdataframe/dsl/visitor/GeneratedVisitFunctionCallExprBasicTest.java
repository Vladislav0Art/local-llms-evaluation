package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprBasicTest {

    @Test
    public void visitFunctionCallExprBasicTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("abs", Lists.mutable.of(new StringValue("b")));
        prettyPrintVisitor.visitFunctionCallExpr(functionCallExpr);
        assertEquals("abs(\"b\")", printer.toString());
    }

}