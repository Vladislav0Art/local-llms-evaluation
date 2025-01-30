package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(new VarExpr("TestConditionVariableName", false), new VarExpr("TestIfScriptVarName", false), new VarExpr("TestElseScriptVarName", false));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        ifElseExpr.accept(prettyPrintVisitor);
        assertEquals("TestConditionVariableName ? TestIfScriptVarName : TestElseScriptVarName", prettyPrintVisitor.toString());
    }

}