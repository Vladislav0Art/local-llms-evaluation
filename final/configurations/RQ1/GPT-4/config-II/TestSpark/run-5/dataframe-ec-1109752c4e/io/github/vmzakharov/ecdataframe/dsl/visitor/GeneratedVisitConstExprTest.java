package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        StringValue expr = new StringValue("Test");
        visitor.visitConstExpr(expr);

        assertEquals("'Test'", printer.toString());
    }

}