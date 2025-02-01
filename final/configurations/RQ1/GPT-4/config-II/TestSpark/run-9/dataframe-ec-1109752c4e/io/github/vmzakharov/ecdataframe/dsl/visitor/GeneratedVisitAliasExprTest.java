package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.BooleanValue;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AliasExpr aliasExpr = new AliasExpr("a", new DecimalValue(10));
        visitor.visitAliasExpr(aliasExpr);

        assertEquals("a : 10", visitor.toString());
    }

}