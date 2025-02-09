package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.SimpleValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        VarExpr expr = new VarExpr("x");
        visitor.visitVarExpr(expr);
        assertEquals("\"x\"", visitor.toString());
    }

}