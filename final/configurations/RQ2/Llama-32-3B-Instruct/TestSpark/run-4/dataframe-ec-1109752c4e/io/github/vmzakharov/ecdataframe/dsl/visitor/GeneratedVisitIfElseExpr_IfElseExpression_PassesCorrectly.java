package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitIfElseExpr_IfElseExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitIfElseExpr_IfElseExpression_PassesCorrectly() {
        IfElseExpr ifElseExpr = new IfElseExpr("a", 2, 3);
        prettyPrintVisitor.visitIfElseExpr(ifElseExpr);
    }

}