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

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr(null,
                "testFunc",
                Arrays.asList(new StringValue("test1"), new StringValue("test2")));

        Printer printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitFunctionCallExpr(functionCallExpr);

        Assert.assertEquals("testFunc(\"test1\", \"test2\")", printer.toString());
    }

}