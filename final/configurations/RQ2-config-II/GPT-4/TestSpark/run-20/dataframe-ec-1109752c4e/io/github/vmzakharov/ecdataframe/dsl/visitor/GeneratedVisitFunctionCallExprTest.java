package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr fce = new FunctionCallExpr("sum", new VarExpr("x"), new DecimalExpr(2));

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        fce.visit(visitor);

        assertEquals("sum ( x , 2 )", visitor.toString());
    }

}