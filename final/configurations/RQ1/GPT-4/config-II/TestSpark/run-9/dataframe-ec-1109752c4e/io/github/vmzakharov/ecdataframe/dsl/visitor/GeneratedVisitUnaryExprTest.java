package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.MINUS, new DecimalValue(10));
        visitor.visitUnaryExpr(unaryExpr);

        assertEquals("- (10)", visitor.toString());
    }

}