package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("hello", false), BinaryOperator.PLUS, new VarExpr("world", false));
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new CollectingPrinter());
        binaryExpr.accept(prettyPrintVisitor);
        assertEquals("(hello + world)", prettyPrintVisitor.toString());
    }

}