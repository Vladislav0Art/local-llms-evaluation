package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitVectorExpr {

    @Test
    public void testVisitVectorExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression vectorExpr = new VectorExpr(new ConstExpr(Value.create(3)), "x");
        visitor.visitVectorExpr(vectorExpr);
        assertMocked(visitor.printer, Value.create("1"));
    }

}