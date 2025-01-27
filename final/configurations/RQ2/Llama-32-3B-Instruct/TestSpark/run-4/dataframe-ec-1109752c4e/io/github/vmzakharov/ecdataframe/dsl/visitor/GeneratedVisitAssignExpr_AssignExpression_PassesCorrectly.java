package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitAssignExpr_AssignExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitAssignExpr_AssignExpression_PassesCorrectly() {
        AssigningExpr assigningExpr = new AssigningExpr("a", new DecimalExpr(2));
        prettyPrintVisitor.visitAssignExpr(assigningExpr);
    }

}