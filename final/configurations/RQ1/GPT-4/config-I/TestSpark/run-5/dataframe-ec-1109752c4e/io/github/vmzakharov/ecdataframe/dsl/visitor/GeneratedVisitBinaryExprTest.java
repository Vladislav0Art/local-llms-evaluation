package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(null, new AnonymousScript(null), BinaryOp.ADD, new AnonymousScript(null));
        CollectingPrinter printer = new CollectingPrinter();
        expr.getOperand1().addExpression(() -> "operand1");
        expr.getOperand2().addExpression(() -> "operand2");
        new PrettyPrintVisitor(printer).visitBinaryExpr(expr);
        assertEquals("(operand1 + operand2)", printer.toString());
    }

}