package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = new BinaryExpr(new VarExpr("x"), BinaryOp.PLUS, new DecimalExpr(2));

        String value = PrettyPrintVisitor.exprToString(e);

        assertEquals("(x + 2)", value);
    }

}