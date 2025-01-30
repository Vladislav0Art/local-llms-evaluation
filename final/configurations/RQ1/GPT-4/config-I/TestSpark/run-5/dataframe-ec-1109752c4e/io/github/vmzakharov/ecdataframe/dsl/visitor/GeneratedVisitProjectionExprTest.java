package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Arrays;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        ProjectionExpr projectionExpr = new ProjectionExpr(null,
                Arrays.asList(new StringValue("test")),
                new StringValue("test2"));

        Printer printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitProjectionExpr(projectionExpr);

        Assert.assertEquals("project {\"test\"} where \"test2\"", printer.toString());
    }

}