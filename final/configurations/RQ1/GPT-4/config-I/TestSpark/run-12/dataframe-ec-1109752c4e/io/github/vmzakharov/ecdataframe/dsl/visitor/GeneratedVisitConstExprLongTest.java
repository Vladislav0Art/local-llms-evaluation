package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprLongTest {

    @Test
    public void visitConstExprLongTest() {
        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
        Value val = new LongValue(99L);
        val.accept(ppv);
        assertEquals("99", ppv.toString());
    }

}