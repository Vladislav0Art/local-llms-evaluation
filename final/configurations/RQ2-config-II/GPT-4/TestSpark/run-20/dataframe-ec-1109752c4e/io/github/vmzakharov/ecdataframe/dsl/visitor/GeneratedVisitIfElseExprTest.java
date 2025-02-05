package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(new BinaryExpr(new VarExpr("x"), BinaryOp.GREATER, new DecimalExpr(2)), new VarExpr("y"), new VarExpr("z"));

        PrettyPrintVisitor v = new PrettyPrintVisitor();

        ifElseExpr.visit(v);

        assertEquals("if (x > 2) y else z", v.toString());
    }

}