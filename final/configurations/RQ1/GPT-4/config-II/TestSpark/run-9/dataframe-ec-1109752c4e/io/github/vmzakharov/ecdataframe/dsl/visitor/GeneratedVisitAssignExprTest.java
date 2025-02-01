package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssingExpr assignExpr = new AssingExpr("result", new DecimalValue(10));
        visitor.visitAssignExpr(assignExpr);

        assertEquals("result = 10", visitor.toString());
    }

}