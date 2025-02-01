package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        IndexExpr indexExpr = new IndexExpr(new VarExpr("v"), new DecimalValue(1));
        visitor.visitIndexExpr(indexExpr);

        assertEquals("v[1]", visitor.toString());
    }

}