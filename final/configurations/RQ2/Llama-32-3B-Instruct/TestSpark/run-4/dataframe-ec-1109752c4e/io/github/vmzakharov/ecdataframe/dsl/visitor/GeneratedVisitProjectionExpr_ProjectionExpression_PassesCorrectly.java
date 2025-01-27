package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitProjectionExpr_ProjectionExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitProjectionExpr_ProjectionExpression_PassesCorrectly() {
        ProjectionExpr projectionExpr = new ProjectionExpr(new DecimalExpr(2), "a");
        prettyPrintVisitor.visitProjectionExpr(projectionExpr);
    }

}