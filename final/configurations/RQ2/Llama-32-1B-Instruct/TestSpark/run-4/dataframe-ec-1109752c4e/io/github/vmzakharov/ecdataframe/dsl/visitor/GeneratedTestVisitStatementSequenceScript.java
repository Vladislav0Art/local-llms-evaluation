package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;

public class GeneratedTestVisitStatementSequenceScript {

    @Test
    public void testVisitStatementSequenceScript() {
        Expression expr = new StatementSequenceScript(new VarExpr("x", "int"), new IfElseExpr(new VarExpr("y", "bool"), new UnaryExpr(">", 5), new VarExpr("z", "float")));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assertions.assertEquals(1, PrettyPrintVisitor.visitStatementSequenceScript(expr));
    }

}