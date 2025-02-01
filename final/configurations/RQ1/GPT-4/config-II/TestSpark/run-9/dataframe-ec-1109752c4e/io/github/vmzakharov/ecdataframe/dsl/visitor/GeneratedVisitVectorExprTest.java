package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VectorExpr vectorExpr = new VectorExpr();
        vectorExpr.addElement(new DecimalValue(10));
        vectorExpr.addElement(new DecimalValue(20));
        visitor.visitVectorExpr(vectorExpr);

        assertEquals("(10, 20)", visitor.toString());
    }

}