package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionScript functionScript = new FunctionScript("printHello");
        functionScript.addExpression(new FunctionCallExpr("print", new StringValue("Hello")));
        visitor.visitFunctionScriptExpr(functionScript);

        assertEquals("function printHello\n{\n  print(\"Hello\")\n}", visitor.toString());
    }

}