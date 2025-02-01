package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.*;
import org.junit.Test;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExprEscaped = new VarExpr(null, "x", true);
        assertEquals("${x}", PrettyPrintVisitor.exprToString(varExprEscaped));

        VarExpr varExpr = new VarExpr(null, "y", false);
        assertEquals("y", PrettyPrintVisitor.exprToString(varExpr));
    }

}