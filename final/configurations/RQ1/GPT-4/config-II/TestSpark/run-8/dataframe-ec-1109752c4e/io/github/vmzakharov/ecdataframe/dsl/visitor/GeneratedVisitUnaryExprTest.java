package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NEGATE, new ConstExpr(new IntValue(5)));
        assertEquals("- (5)", PrettyPrintVisitor.exprToString(unaryExpr));
    }

}