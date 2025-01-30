package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprNormalTest {

    @Test
    public void visitFunctionCallExprNormalTest() {
        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
        FunctionCallExpr fce = new FunctionCallExpr("add", new VarExpr("p"), new VarExpr("q"));
        fce.accept(ppv);
        assertEquals("add(p, q)", ppv.toString());
    }

}