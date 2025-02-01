package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("object.property");
        visitor.visitPropertyPathExpr(propertyPathExpr);

        assertEquals("object.property", visitor.toString());
    }

}