package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitBinaryExpr {

    @Test
    public void testVisitBinaryExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression binaryExpr = new BinaryExpr(new AliasExpr("a"), new DecimalExpr(1));
        visitor.visitBinaryExpr(binaryExpr);
        assertMocked(visitor.printer, Value.create("1"));
    }

}