package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr(new VarExpr("x"), new DecimalExpr(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        assignExpr.visit(visitor);

        assertEquals("x = 2", visitor.toString());
    }

}