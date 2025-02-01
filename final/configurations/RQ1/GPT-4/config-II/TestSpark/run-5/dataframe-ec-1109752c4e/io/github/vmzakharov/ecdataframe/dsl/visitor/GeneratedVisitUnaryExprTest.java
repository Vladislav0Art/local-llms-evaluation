package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(new VarExpr("a"), UnaryOp.NOT);
        visitor.visitUnaryExpr(expr);

        assertEquals("!a", printer.toString());
    }

}