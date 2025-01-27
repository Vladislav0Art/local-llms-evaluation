package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitUnaryExpr_UnaryExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitUnaryExpr_UnaryExpression_PassesCorrectly() {
        UnaryExpr unaryExpr = new UnaryExpr(new VarExpr("a"), "-");
        prettyPrintVisitor.visitUnaryExpr(unaryExpr);
    }

}