package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueDecimal;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueString;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        ValueString value = new ValueString("test value");
        String output = PrettyPrintVisitor.exprToString(value);
        assertEquals("test value", output);
    }

}