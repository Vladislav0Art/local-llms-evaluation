package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.IfElseExpr;
import io.github.vmzakharov.ecdataframe.dsl.IndexExpr;
import io.github.vmzakharov.ecdataframe.dsl.ProjectionExpr;
import io.github.vmzakharov.ecdataframe.dsl.PropertyPathExpr;
import io.github.vmzakharov.ecdataframe.dsl.StatementSequenceScript;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.VectorExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;

public class GeneratedTest {

    private Printer printer = new PrinterFactory().createPrinter();

    @Test
    public void testPrettyPrintToString() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = StringIterate.generate("a + b");
        String result = visitor.visit(expr);
        assertEquals("a + b", result);
    }

    @Test
    public void testPrettyPrintAssignExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssignExpr expr = new AssignExpr("x", 5, new VarExpr("x"));
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals(5 + "x", result);
    }

    @Test
    public void testPrettyPrintBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new BinaryOperator("+"), new IntLiteral(10), new BinaryExpr(new BinaryOperator("*"), new IntLiteral(5), new VarExpr("x")));
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("10 * x", result);
    }

    @Test
    public void testPrettyPrintUnaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(new UnaryOperator("+"), new IntLiteral(5));
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("5 + x", result);
    }

    @Test
    public void testPrettyPrintConstExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        ConstExpr expr = new ConstExpr(new IntLiteral(10));
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("10", result);
    }

    @Test
    public void testPrettyPrintFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        FunctionCallExpr expr = new FunctionCallExpr(new IntLiteral(5), "sin", new VarExpr("x"));
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("sin(x)", result);
    }

    @Test
    public void testPrettyPrintPropertyPathExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        PropertyPathExpr expr = new PropertyPathExpr(new IntLiteral(5), "x");
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("5*x", result);
    }

    @Test
    public void testPrettyPrintAnonymousScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AnonymousScript script = new AnonymousScript(new IntLiteral(10), new VarExpr("x"));
        script.setPrinter(visitor);
        String result = visitor.visit(script);
        assertEquals("10 + x", result);
    }

    @Test
    public void testPrettyPrintFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        FunctionScript script = new FunctionScript(new IntLiteral(5), "sin");
        script.setPrinter(visitor);
        String result = visitor.visit(script);
        assertEquals("sin(x)", result);
    }

    @Test
    public void testPrettyPrintStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        StatementSequenceScript script = new StatementSequenceScript(new IntLiteral(10), "x > 5");
        script.setPrinter(visitor);
        String result = visitor.visit(script);
        assertEquals("x > 5", result);
    }

    @Test
    public void testPrettyPrintVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        VarExpr expr = new VarExpr("x");
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("x", result);
    }

    @Test
    public void testPrettyPrintProjectionExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        ProjectionExpr expr = new ProjectionExpr(new IntLiteral(10), new VarExpr("y"));
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("x", result);
    }

    @Test
    public void testPrettyPrintAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AliasExpr expr = new AliasExpr(new IntLiteral(5), "sin");
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("sin", result);
    }

    @Test
    public void testPrettyPrintIndexExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        IndexExpr expr = new IndexExpr(new IntLiteral(10), 2, "x");
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("10[2]", result);
    }

    @Test
    public void testPrettyPrintVariableExpression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        VariableExpression expr = new VariableExpression(new IntLiteral(5), "x");
        expr.setPrinter(visitor);
        String result = visitor.visit(expr);
        assertEquals("5*x", result);
    }
}

}