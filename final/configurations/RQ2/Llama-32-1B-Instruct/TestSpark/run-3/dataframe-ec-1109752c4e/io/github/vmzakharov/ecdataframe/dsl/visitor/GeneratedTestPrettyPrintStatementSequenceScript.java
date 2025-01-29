package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.IfElseExpr;
import io.github.vmzakharov.ecdataframe.dsl.IndexExpr;
import io.github.vmzakharov.ecdataframe.dsl.ProjectionExpr;
import io.github.vmzakharov.ecdataframe.dsl.PropertyPathExpr;
import io.github.vmzakharov.ecdataframe.dsl.StatementSequenceScript;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.VectorExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;

public class GeneratedTestPrettyPrintStatementSequenceScript {

    private Printer printer = new PrinterFactory().createPrinter();

    @Test
    public void testPrettyPrintStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        StatementSequenceScript script = new StatementSequenceScript(new IntLiteral(10), "x > 5");
        script.setPrinter(visitor);
        String result = visitor.visit(script);
        assertEquals("x > 5", result);
    }

}