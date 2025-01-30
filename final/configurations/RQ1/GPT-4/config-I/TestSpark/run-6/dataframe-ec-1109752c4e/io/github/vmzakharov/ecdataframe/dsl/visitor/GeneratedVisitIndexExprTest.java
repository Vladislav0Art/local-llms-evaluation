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

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = new IndexExpr(new VarExpr("TestVectorVariableName"), new VarExpr("TestIndexVariableName"));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        indexExpr.accept(prettyPrintVisitor);
        assertEquals("TestVectorVariableName[TestIndexVariableName]", prettyPrintVisitor.toString());
    }

}