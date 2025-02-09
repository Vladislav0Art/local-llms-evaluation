package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        StringValue expr = new StringValue("John Snow");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitConstExpr(expr);
        assertEquals("'John Snow'", visitor.toString());
    }

}