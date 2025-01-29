package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitAliasExpr {

    @Test
    public void testVisitAliasExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression aliasExpr = new AliasExpr(new ConstExpr(Value.create(2)), "y");
        visitor.visitAliasExpr(aliasExpr);
        assertMocked(visitor.printer, Value.create("2"));
    }

}