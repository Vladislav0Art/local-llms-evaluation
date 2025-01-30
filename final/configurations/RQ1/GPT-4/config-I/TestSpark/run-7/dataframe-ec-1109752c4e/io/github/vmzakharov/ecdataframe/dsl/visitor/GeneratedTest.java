package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript.FunctionMethod;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitAssignExpr(new AssignExpr("varName", new ValueExpr(Value.newInt(100))));

        Assert.assertEquals("varName = 100", printer.toString());
    }

    @Test
    public void visitBinaryExprTrueTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitBinaryExpr(new BinaryExpr(
                        new ValueExpr(Value.newInt(100)),
                        new ValueExpr(Value.newInt(200)),
                        Operation.ADD));

        Assert.assertEquals("(100 + 200)", printer.toString());
    }

    @Test
    public void visitUnaryExprTrueTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitUnaryExpr(new UnaryExpr(Operation.NOT, new ValueExpr(Value.newBool(true))));

        Assert.assertEquals("!(true)", printer.toString());
    }

    @Test
    public void visitFunctionCallExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitFunctionCallExpr(new FunctionCallExpr(
                        "funcName",
                        Lists.immutable.of(new ValueExpr(Value.newInt(100)), new ValueExpr(Value.newBool(true)),
                                new ValueExpr(Value.newDecimal(200)))));

        Assert.assertEquals("funcName(100, true, 200)", printer.toString());
    }

    @Test
    public void visitPropertyPathExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitPropertyPathExpr(new PropertyPathExpr("path.to.example"));

        Assert.assertEquals("path.to.example", printer.toString());
    }

    @Test
    public void visitStatementSequenceScriptTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitStatementSequenceScript(new StatementSequenceScript(
                        Lists.immutable.of(new ValueExpr(Value.newInt(100)), new ValueExpr(Value.newBool(true)),
                                new ValueExpr(Value.newDecimal(200)))));

        Assert.assertEquals("100\ntrue\n200\n", printer.toString());
    }

    @Test
    public void visitVarExprTrueTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitVarExpr(new VarExpr("varName", true));

        Assert.assertEquals("${varName}", printer.toString());
    }

    @Test
    public void visitProjectionExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitProjectionExpr(new ProjectionExpr(
                        Lists.immutable.of(
                                new AliasExpr("alias", new ValueExpr(Value.newInt(10))),
                                new AliasExpr("alias2", new ValueExpr(Value.newInt(20)))
                        ),
                        null));

        Assert.assertEquals("project {alias : 10, alias2 : 20}", printer.toString());
    }

    @Test
    public void visitAliasExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitAliasExpr(
                new AliasExpr("alias", new ValueExpr(Value.newInt(1000)))
        );

        Assert.assertEquals("alias : 1000", printer.toString());
    }

    @Test
    public void visitVectorExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitVectorExpr(new VectorExpr(
                        Lists.immutable.of(new ValueExpr(Value.newInt(100)), new ValueExpr(Value.newBool(true)),
                                new ValueExpr(Value.newDecimal(200)))));

        Assert.assertEquals("(100, true, 200)", printer.toString());
    }

    @Test
    public void visitIndexExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitIndexExpr(new IndexExpr(
                        new ValueExpr(Value.newInt(10000)),
                        new ValueExpr(Value.newInt(999))));

        Assert.assertEquals("10000[999]", printer.toString());
    }

    @Test
    public void visitDecimalExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitDecimalExpr(new DecimalExpr(
                        new ValueExpr(Value.newInt(10000)),
                        new ValueExpr(Value.newInt(3))));

        Assert.assertEquals("[10000,3]", printer.toString());
    }

    @Test
    public void visitIfElseExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitIfElseExpr(new IfElseExpr(
                new ValueExpr(Value.newBool(true)),
                new ValueExpr(Value.newInt(100)),
                new ValueExpr(Value.newDecimal(200))
        ));

        Assert.assertEquals("true ? 100 : 200", printer.toString());
    }

    @Test
    public void visitAnonymousScriptExprTest() {
        CollectingPrinter printer = new CollectingPrinter();

        FunctionScript functionScript1 = new FunctionScript("funcName");
        functionScript1.setMethod(FunctionMethod.ADD);
        functionScript1.setExpressions(Lists.immutable.of(new ValueExpr(Value.newInt(10))));

        FunctionScript functionScript2 = new FunctionScript("funcName2");
        functionScript2.setMethod(FunctionMethod.MUL);
        functionScript2.setExpressions(
                Lists.immutable.of(new AssignExpr("varName", new ValueExpr(Value.newInt(999))))
        );

        AnonymousScript anonymousScript = new AnonymousScript(
                Maps.immutable.of("funcName", functionScript1, "funcName2", functionScript2),
                Lists.immutable.of(new AssignExpr("anotherName", new ValueExpr(Value.newInt(20000))))
        );

        new PrettyPrintVisitor(printer).visitAnonymousScriptExpr(anonymousScript);

        Assert.assertEquals(
                "function funcName(10)\n\nfunction funcName2(varName = 999)\n\nanotherName = 20000\n",
                printer.toString()
        );
    }

    @Test
    public void visitFunctionScriptExprTest() {
        CollectingPrinter printer = new CollectingPrinter();

        FunctionScript functionScript = new FunctionScript("funcName");
        functionScript.setMethod(FunctionMethod.MUL);
        functionScript.setExpressions(Lists.immutable.of(
                new AssignExpr("varName", new ValueExpr(Value.newInt(999))))
        );

        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(functionScript);

        Assert.assertEquals(
                "function funcName\n{\n  varName = 999\n}\n",
                printer.toString()
        );
    }

}