package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
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

public class GeneratedTest {

    public static PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new Printer());
    public static PrettyPrintVisitor prettyPrintVisitorWithPrinter = new PrettyPrintVisitor(PrinterFactory.getInstance());

    @Test
    public void test_exprToString() {
        Expression expr = StringIterate.of(1, 2).map((x) -> x * x).expr();
        String expectedResult = "4";
        assertEquals(expectedResult, exprToString(expr));
    }

    @Test
    public void visitAssignExpr_test() {
        AssignExpr expr = new AssignExpr("a", 10);
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("a: 10", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("a: 10", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitBinaryExpr_test() {
        BinaryExpr expr = new BinaryExpr(2, 3, "b");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("+ b", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("+ b", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitUnaryExpr_test() {
        UnaryExpr expr = new UnaryExpr("x");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("- x", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("- x", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitConstExpr_test() {
        ConstExpr expr = new ConstExpr("c");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("c: 10", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("c: 10", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitFunctionCallExpr_test() {
        FunctionCallExpr expr = new FunctionCallExpr("f", "x");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("f(x)", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("f(x)", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitPropertyPathExpr_test() {
        PropertyPathExpr expr = new PropertyPathExpr("x", "y");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("x.y", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("x.y", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitAnonymousScriptExpr_test() {
        AnonymousScript expr = new AnonymousScript();
        prettyPrintVisitor.visit(expr);
        assert Eq.equal(" anonymous script ", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal(" anonymous script ", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitFunctionScriptExpr_test() {
        FunctionScript expr = new FunctionScript();
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("function script", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("function script", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitIfElseExpr_test() {
        IfElseExpr expr = new IfElseExpr();
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("if (x > 5) { y = z } else { z = w }", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("if (x > 5) { y = z } else { z = w }", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitIndexExpr_test() {
        IndexExpr expr = new IndexExpr(1, "a");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("a[1]", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("a[1]", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitDecimalExpr_test() {
        DecimalExpr expr = new DecimalExpr(3.14);
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("3.14", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("3.14", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitVarExpr_test() {
        VarExpr expr = new VarExpr("x");
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("x", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("x", prettyPrintVisitorWithPrinter.print());
    }

    @Test
    public void visitVectorExpr_test() {
        VectorExpr expr = new VectorExpr();
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("[1, 2, 3]", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("[1, 2, 3]", prettyPrintVisitorWithPrinter.print());
    }

}