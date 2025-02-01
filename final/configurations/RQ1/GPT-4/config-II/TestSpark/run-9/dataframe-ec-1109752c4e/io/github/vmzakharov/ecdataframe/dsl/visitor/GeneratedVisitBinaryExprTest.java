package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        BinaryExpr binaryExpr = new BinaryExpr(new DecimalValue(10), BinaryOp.ADD, new DecimalValue(20));
        visitor.visitBinaryExpr(binaryExpr);

        assertEquals("(10 + 20)", visitor.toString());
    }

}