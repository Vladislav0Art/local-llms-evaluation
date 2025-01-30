package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        String functionName = "testFunction";
        List<String> parameterNames = Collections.singletonList("testParameter");
        FunctionScript functionScript = new FunctionScript(null, functionName, parameterNames, Arrays.asList(new AliasExpr(null, "testAlias", new StringValue("test"))));
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(functionScript);
        Assert.assertEquals("function testFunction(testParameter)\n{\n  testAlias : \"test\"\n}\n", printer.toString());
    }

}