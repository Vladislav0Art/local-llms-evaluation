package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        DecimalExpr decimalExpr = new DecimalExpr(new DecimalValue(10), new DecimalValue(2));
        visitor.visitDecimalExpr(decimalExpr);

        assertEquals("[10, 2]", visitor.toString());
    }

}