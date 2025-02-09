package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr expr = new AssingExpr(new VarExpr(new StringValue("Assignment")), new DecimalExpr(new DecimalValue(15)));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitAssignExpr(expr);
        assertEquals("Assignment = 15", visitor.toString());
    }

}