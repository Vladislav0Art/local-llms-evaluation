package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr varExpr = new VarExpr("x");
        visitor.visitVarExpr(varExpr);

        assertEquals("x", visitor.toString());
    }

}