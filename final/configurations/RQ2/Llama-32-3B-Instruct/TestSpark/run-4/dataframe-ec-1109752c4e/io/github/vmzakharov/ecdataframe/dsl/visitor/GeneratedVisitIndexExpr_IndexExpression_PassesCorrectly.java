package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitIndexExpr_IndexExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitIndexExpr_IndexExpression_PassesCorrectly() {
        IndexExpr indexExpr = new IndexExpr(new VarExpr("a"), 1);
        prettyPrintVisitor.visitIndexExpr(indexExpr);
    }

}