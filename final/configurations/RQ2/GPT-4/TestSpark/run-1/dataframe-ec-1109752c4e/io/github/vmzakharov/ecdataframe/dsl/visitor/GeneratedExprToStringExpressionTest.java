package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class GeneratedExprToStringExpressionTest {

    @Test
    public void exprToStringExpressionTest() {
        Expression expression = new DecimalExpr(null, new BigDecimal(10));
        String actual = PrettyPrintVisitor.exprToString(expression);
        assertEquals("10", actual);
    }

}