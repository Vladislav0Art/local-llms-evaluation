package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedVisitAnonymousScriptExpr_AtomicallyWorks {

    private final Printer printer = new CollectingPrinter();

    @Test
    public void visitAnonymousScriptExpr_AtomicallyWorks() {
        AnonymousScript expr = new AnonymousScript(
                new FunctionCallExpr("func", new BinaryExpr(new VarExpr("x"), "+", new DecimalExpr(2)))
        );
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        visitor.visitAnonymousScriptExpr(expr);
    }

}