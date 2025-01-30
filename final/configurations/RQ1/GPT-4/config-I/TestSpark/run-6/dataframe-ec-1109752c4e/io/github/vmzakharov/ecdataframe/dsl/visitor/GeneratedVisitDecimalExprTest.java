package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.operator.BinaryOperator;
import io.github.vmzakharov.ecdataframe.dsl.operator.UnaryOperator;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.assertEquals;

import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = new DecimalExpr(new VarExpr("TestVariableName1"), new VarExpr("TestVariableName2"));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        decimalExpr.accept(prettyPrintVisitor);
        assertEquals("[TestVariableName1,TestVariableName2]", prettyPrintVisitor.toString());
    }

}