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

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        CollectingPrinter printer = new CollectingPrinter();

        FunctionScript functionScript1 = new FunctionScript("funcName");
        functionScript1.setMethod(FunctionMethod.ADD);
        functionScript1.setExpressions(Lists.immutable.of(new ValueExpr(Value.newInt(10))));

        FunctionScript functionScript2 = new FunctionScript("funcName2");
        functionScript2.setMethod(FunctionMethod.MUL);
        functionScript2.setExpressions(
                Lists.immutable.of(new AssignExpr("varName", new ValueExpr(Value.newInt(999))))
        );

        AnonymousScript anonymousScript = new AnonymousScript(
                Maps.immutable.of("funcName", functionScript1, "funcName2", functionScript2),
                Lists.immutable.of(new AssignExpr("anotherName", new ValueExpr(Value.newInt(20000))))
        );

        new PrettyPrintVisitor(printer).visitAnonymousScriptExpr(anonymousScript);

        Assert.assertEquals(
                "function funcName(10)\n\nfunction funcName2(varName = 999)\n\nanotherName = 20000\n",
                printer.toString()
        );
    }

}