package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprNormalTest {

    @Test
    public void visitBinaryExprNormalTest() {
        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
        BinaryExpr expr = new BinaryExpr(new VarExpr("y"), new NumberValue(2)) {
            @Override
            public Operation getOperation() {
                return Operation.ADD;
            }
        };
        expr.accept(ppv);
        assertEquals("(y + 2)", ppv.toString());
    }

}