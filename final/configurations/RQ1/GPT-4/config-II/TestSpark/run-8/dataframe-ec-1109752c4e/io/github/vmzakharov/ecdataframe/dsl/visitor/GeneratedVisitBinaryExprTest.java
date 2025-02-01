package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, new ConstExpr(new IntValue(5)), BinaryOp.ADDITION, new ConstExpr(new IntValue(3)));
        assertEquals("(5 + 3)", PrettyPrintVisitor.exprToString(binaryExpr));
    }

}