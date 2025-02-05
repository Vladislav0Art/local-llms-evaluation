package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPropertyPathExpressionTest {

    @Test
    public void propertyPathExpressionTest() {
        PropertyPathExpr expr = new PropertyPathExpr(new VarExpr("var1"), "property1");
        String expectedOutput = "var1.property1";
        assertEquals(expectedOutput, PrettyPrintVisitor.exprToString(expr));
    }

}