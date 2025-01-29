package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.StringIterate;
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

public class GeneratedVisitAssignExpr_test {

    public static PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(new Printer());
    public static PrettyPrintVisitor prettyPrintVisitorWithPrinter = new PrettyPrintVisitor(PrinterFactory.getInstance());

    @Test
    public void visitAssignExpr_test() {
        AssignExpr expr = new AssignExpr("a", 10);
        prettyPrintVisitor.visit(expr);
        assert Eq.equal("a: 10", prettyPrintVisitor.print());
        prettyPrintVisitorWithPrinter.visit(expr);
        assert Eq.equal("a: 10", prettyPrintVisitorWithPrinter.print());
    }

}