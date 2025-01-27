package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedVisitFunctionCallExpr_AtomicallyWorks {

    private final Printer printer = new CollectingPrinter();

    @Test
    public void visitFunctionCallExpr_AtomicallyWorks() {
        FunctionCallExpr expr = new FunctionCallExpr(
                "func",
                new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(2))
        );
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitFunctionCallExpr(expr);
    }

}