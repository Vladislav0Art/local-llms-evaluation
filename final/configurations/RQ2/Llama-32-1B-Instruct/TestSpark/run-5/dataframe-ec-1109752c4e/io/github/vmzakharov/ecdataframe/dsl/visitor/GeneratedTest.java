package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dslDecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.IndexExpr;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.VectorExpr;
import io.github.vmzakharov.ecdataframe.dsl.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;

public class GeneratedTest {

    public static String exprToString(Expression e) {
        CollectingPrinter printer = PrinterFactory.create();
        if (e instanceof AliasExpr aliasExpr) {
            printer.print("alias ");
            printer.print(aliasExpr.getName());
            printer.print(": ");
            printer.print(e.toString());
        } else if (e instanceof VarExpr varExpr) {
            printer.print(varExpr.getName());
            printer.print(": ");
            printer.print(e.toString());
        } else if (e instanceof Value value) {
            printer.print("value ");
            printer.print(value);
            printer.println();
        } else if (e instanceof UnaryExpr unaryExpr) {
            printer.print(unaryExpr.getExpression().toString());
        } else if (e instanceof BinaryExpr binaryExpr) {
            printer.print("(");
            printer.print(binaryExpr.toString());
            printer.println(")");
        }
    }

    @Test
    public void testVisitAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        String exprStr = "x = 5";
        Expression e = Expression.parse(exprStr);
        String printedStr = visitor.visit(e);
        assertEquals(exprStr, printedStr);
    }

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression e = Expression.parse("(x + 5)");
        Expression expr = BinaryExpr.parse(e.toString());
        String printedStr = visitor.visit(expr);
        assertEquals("x + 5", printedStr);
    }

    @Test
    public void testVisitConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value value = Value.parse("10");
        Expression e = Expression.parse("(10)");
        int result = (int) exprToString(e);
        assertEquals(10, result);
    }

    @Test
    public void testVisitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression e = Expression.parse("[x + y]");
        Expression expr = FunctionCallExpr.parse(e.toString());
        String printedStr = visitor.visit(expr);
        assertEquals("x + y", printedStr);
    }

    @Test
    public void testVisitPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr e = new PropertyPathExpr("y", "x");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("y", printedStr);
    }

    @Test
    public void testVisitAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AnonymousScript e = new AnonymousScript("[x + y]");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("[x + y]", printedStr);
    }

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript e = new FunctionScript("(x * 2)", "[y + z]");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("x * 2", printedStr);
    }

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        StatementSequenceScript e = new StatementSequenceScript("[x + y]");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("x + y", printedStr);
    }

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr e = new VarExpr("y");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("y", printedStr);
    }

    @Test
    public void testVisitProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        ProjectionExpr e = new ProjectionExpr("[z + x]");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("[x + z]", printedStr);
    }

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr e = new AliasExpr("z", "y");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("z", printedStr);
    }

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr e = new VectorExpr("[x, y]");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("[x, y]", printedStr);
    }

    @Test
    public void testVisitValue() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value value = Value.parse("10");
        String printedStr = visitor.visit(value);
        assertEquals("10", printedStr);
    }
}

}