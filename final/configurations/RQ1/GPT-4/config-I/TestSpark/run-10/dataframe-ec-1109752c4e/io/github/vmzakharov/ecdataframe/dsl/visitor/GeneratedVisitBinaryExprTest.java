package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.StringExpression;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Printer printer = new CollectingPrinter();
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new StringExpression("test1"), BinaryOp.EQ, new StringExpression("test2"));
        prettyPrintVisitor.visitBinaryExpr(expr);
        assertEquals("('test1') == ('test2')", printer.toString());
    }

}