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

public class GeneratedVisitAssignExpr {

    @Test
    public void visitAssignExpr() {
        Printer printer = new CollectingPrinter();
        ExpressionVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        AssignExpr assignExpr = new AssignExpr("var", false, new StringExpression("test"));
        prettyPrintVisitor.visitAssignExpr(assignExpr);
        assertEquals("var = 'test'", printer.toString());
    }

}