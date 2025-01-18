package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueDecimal;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueString;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = new DecimalExpr(null, new ValueDecimal(10.0));
        String output = PrettyPrintVisitor.exprToString(decimalExpr);
        assertEquals("10.0", output);
    }

}