package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value value = Value.newValue("ConstExprString");
        value.visit(new PrettyPrintVisitor(value, false));
        String expectResult = "(ConstExprString)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(value));
    }

}