package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprNormalTest {

    @Test
    public void visitAssignExprNormalTest() {
        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
        AssignExpr expr = new AssignExpr(new VarExpr("x"), new StringValue("abc"));
        expr.accept(ppv);
        assertEquals("x = \"abc\"", ppv.toString());
    }

}