package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
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
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void exprToStringValidInputTest() {
        AnonymousScript input = Mockito.mock(AnonymousScript.class);

        String result = PrettyPrintVisitor.exprToString(input);

        Assert.assertNotNull(result);
    }

    @Test
    public void visitAssignExprValidInputTest() {
        AssingExpr expr = Mockito.mock(AssingExpr.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);

        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitBinaryExprValidInputTest() {
        BinaryExpr expr = Mockito.mock(BinaryExpr.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);

        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitUnaryExprValidInputTest() {
        UnaryExpr expr = Mockito.mock(UnaryExpr.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);

        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitFunctionCallExprValidInputTest() {
        FunctionCallExpr expr = Mockito.mock(FunctionCallExpr.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionCallExpr(expr);

        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitPropertyPathExprValidInputTest() {
        PropertyPathExpr expr = Mockito.mock(PropertyPathExpr.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitPropertyPathExpr(expr);

        Assert.assertNotNull(visitor);
    }

    @Test
    public void visitAnonymousScriptExprValidInputTest() {
        AnonymousScript expr = Mockito.mock(AnonymousScript.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAnonymousScriptExpr(expr);

        Assert.assertNotNull(visitor);
    }

}