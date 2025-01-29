package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.AliasExpr;
import io.github.vmzakharov.ecdataframe.dsl.AnonymousScript;
import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.BinaryExpr;
import io.github.vmzakharov.ecdataframe.dslDecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.DecimalExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionCallExpr;
import io.github.vmzakharov.ecdataframe.dsl.IndexExpr;
import io.github.vmzakharov.ecdataframe.dsl.UnaryExpr;
import io.github.vmzakharov.ecdataframe.dsl.VarExpr;
import io.github.vmzakharov.ecdataframe.dsl.VectorExpr;
import io.github.vmzakharov.ecdataframe.dsl.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;

public class GeneratedTestVisitVarExpr {

    public static String exprToString(Expression e) {
        CollectingPrinter printer = PrinterFactory.create();
        if (e instanceof AliasExpr aliasExpr) {
            printer.print("alias ");
            printer.print(aliasExpr.getName());
            printer.print(": ");
            printer.print(e.toString());
        } else if (e instanceof VarExpr varExpr) {
            printer.print(varExpr.getName());
            printer.print(": ");
            printer.print(e.toString());
        } else if (e instanceof Value value) {
            printer.print("value ");
            printer.print(value);
            printer.println();
        } else if (e instanceof UnaryExpr unaryExpr) {
            printer.print(unaryExpr.getExpression().toString());
        } else if (e instanceof BinaryExpr binaryExpr) {
            printer.print("(");
            printer.print(binaryExpr.toString());
            printer.println(")");
        }
    }

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr e = new VarExpr("y");
        Expression expr = e.toString();
        String printedStr = visitor.visit(expr);
        assertEquals("y", printedStr);
    }

}