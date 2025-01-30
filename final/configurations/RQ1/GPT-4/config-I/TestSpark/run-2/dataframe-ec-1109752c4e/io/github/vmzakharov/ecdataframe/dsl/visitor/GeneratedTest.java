package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void exprToStringBasicTest() {
        AssingExpr assignExpr = new AssingExpr("a", false, new StringValue("b"));
        String result = PrettyPrintVisitor.exprToString(assignExpr);
        assertEquals("a = \"b\"", result);
    }

    @Test
    public void visitAssignExprBasicTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        AssingExpr assignExpr = new AssingExpr("a", false, new StringValue("b"));
        prettyPrintVisitor.visitAssignExpr(assignExpr);
        assertEquals("a = \"b\"", printer.toString());
    }

    @Test
    public void visitUnaryExprBasicTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, new StringValue("b"));
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
        assertEquals("!(\"b\")", printer.toString());
    }

    @Test
    public void visitFunctionCallExprBasicTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(printer);
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("abs", Lists.mutable.of(new StringValue("b")));
        prettyPrintVisitor.visitFunctionCallExpr(functionCallExpr);
        assertEquals("abs(\"b\")", printer.toString());
    }

}