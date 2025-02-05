package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("x"), BinaryOp.PLUS, new DecimalExpr(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        binaryExpr.visit(visitor);

        assertEquals("( x + 2 )", visitor.toString());
    }

}