package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        FunctionScript functionScript = new FunctionScript("test");
        functionScript.addExpression(new AssingExpr("x", new DecimalValue(10)));
        AnonymousScript anonymousScript = new AnonymousScript();
        anonymousScript.addExpression(new VarExpr("y"));

        assertEquals("function test\n{\n  x = 10\n}", PrettyPrintVisitor.exprToString(functionScript));
        assertEquals("y", PrettyPrintVisitor.exprToString(anonymousScript));
    }

}