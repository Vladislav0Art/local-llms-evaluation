package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        ConstExpr constExpr = new ConstExpr(Value.of(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        constExpr.accept(visitor);

        assertEquals("2", visitor.toString());
    }

}