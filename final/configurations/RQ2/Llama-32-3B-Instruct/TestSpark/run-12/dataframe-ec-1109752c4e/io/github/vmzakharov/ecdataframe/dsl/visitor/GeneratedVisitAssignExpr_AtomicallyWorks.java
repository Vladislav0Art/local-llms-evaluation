package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedVisitAssignExpr_AtomicallyWorks {

    private final Printer printer = new CollectingPrinter();

    @Test
    public void visitAssignExpr_AtomicallyWorks() {
        AssigningExpr expr = new AssigningExpr(
                new PropertyPathExpr(new VarExpr("x"), "y"),
                new BinaryExpr(new VarExpr("z"), "+", new DecimalExpr(2))
        );
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAssignExpr(expr);
    }

}