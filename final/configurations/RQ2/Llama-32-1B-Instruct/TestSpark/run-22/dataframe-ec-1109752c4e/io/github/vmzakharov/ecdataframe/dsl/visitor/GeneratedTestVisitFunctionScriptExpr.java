package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitFunctionScriptExpr {

    @Test
    public void testVisitFunctionScriptExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression functionScriptExpr = new FunctionScriptExpr(new ConstExpr(Value.create("add")), new VarExpr("x"), new VectorExpr(new IntExpr(2)));
        visitor.visitFunctionScriptExpr(functionScriptExpr);
        assertMocked(visitor.printer, Value.create("add"));
    }

}