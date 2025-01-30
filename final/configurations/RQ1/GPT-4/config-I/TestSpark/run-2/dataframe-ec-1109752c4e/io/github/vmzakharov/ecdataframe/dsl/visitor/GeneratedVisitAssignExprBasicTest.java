package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprBasicTest {

    @Test
    public void visitAssignExprBasicTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        AssingExpr assignExpr = new AssingExpr("a", false, new StringValue("b"));
        prettyPrintVisitor.visitAssignExpr(assignExpr);
        assertEquals("a = \"b\"", printer.toString());
    }

}