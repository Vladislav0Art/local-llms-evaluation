package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        ExpressionVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new VarExpr("a"), new VarExpr("b"), BinaryOp.ADD);
        visitor.visitBinaryExpr(expr);

        assertEquals("(a + b)", printer.toString());
    }

}