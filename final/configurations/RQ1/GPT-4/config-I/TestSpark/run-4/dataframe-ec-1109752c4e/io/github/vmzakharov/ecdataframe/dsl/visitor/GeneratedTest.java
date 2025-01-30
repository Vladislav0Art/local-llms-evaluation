package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NOT, new ConstExpr(null, Value.stringValueOf("true")));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        unaryExpr.accept(prettyPrinter);
        Assert.assertEquals("!(\"true\")", printer.toString());
    }

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, new ConstExpr(null, Value.stringValueOf("true")), BinaryOp.OR, new ConstExpr(null, Value.stringValueOf("false")));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        binaryExpr.accept(prettyPrinter);
        Assert.assertEquals("(\"true\" || \"false\")", printer.toString());
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr(null, "total", new ConstExpr(null, Value.stringValueOf("true")), false);
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        assignExpr.accept(prettyPrinter);
        Assert.assertEquals("total = \"true\"", printer.toString());
    }

    @Test
    public void visitVectorExprTest() {
        ListIterable<Expression> expressions = Lists.immutable.of(new ConstExpr(null, Value.stringValueOf("true")),
                new ConstExpr(null, Value.stringValueOf("false")),
                new ConstExpr(null, Value.stringValueOf("true")));

        VectorExpr vectorExpr = new VectorExpr(null, expressions);
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        vectorExpr.accept(prettyPrinter);
        Assert.assertEquals("(\"true\", \"false\", \"true\")", printer.toString());
    }

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(null,
                new ConstExpr(null, Value.stringValueOf("true")),
                new ConstExpr(null, Value.stringValueOf("true")),
                new ConstExpr(null, Value.stringValueOf("false")));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        ifElseExpr.accept(prettyPrinter);
        Assert.assertEquals("\"true\" ? \"true\" : \"false\"", printer.toString());
    }

}