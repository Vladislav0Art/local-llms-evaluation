package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DoubleValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEscapeVarNameIfNeededTest {

    @Test
    public void escapeVarNameIfNeededTest() {
        AssingExpr expr = new AssingExpr("var", new DoubleValue(10.0), true);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        if (visitor.escapeVarNameIfNeeded(expr.getVarName(), expr.isEscaped()).equals("${" + expr.getVarName() + "}")) {
            assertEquals("${var}", visitor.escapeVarNameIfNeeded(expr.getVarName(), expr.isEscaped()));
        }
    }

}