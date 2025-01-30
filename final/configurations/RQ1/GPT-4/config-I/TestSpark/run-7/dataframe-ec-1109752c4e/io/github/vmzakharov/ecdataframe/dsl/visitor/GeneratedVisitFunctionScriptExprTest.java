package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript.FunctionMethod;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        CollectingPrinter printer = new CollectingPrinter();

        FunctionScript functionScript = new FunctionScript("funcName");
        functionScript.setMethod(FunctionMethod.MUL);
        functionScript.setExpressions(Lists.immutable.of(
                new AssignExpr("varName", new ValueExpr(Value.newInt(999))))
        );

        new PrettyPrintVisitor(printer).visitFunctionScriptExpr(functionScript);

        Assert.assertEquals(
                "function funcName\n{\n  varName = 999\n}\n",
                printer.toString()
        );
    }

}