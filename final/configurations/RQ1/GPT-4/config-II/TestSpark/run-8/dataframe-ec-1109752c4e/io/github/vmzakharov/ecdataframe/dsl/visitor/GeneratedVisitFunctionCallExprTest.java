package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr(null, "func", Lists.mutable.of(new ConstExpr(new IntValue(10)), new ConstExpr(new IntValue(20))));
        assertEquals("func(10, 20)", PrettyPrintVisitor.exprToString(functionCallExpr));
    }

}