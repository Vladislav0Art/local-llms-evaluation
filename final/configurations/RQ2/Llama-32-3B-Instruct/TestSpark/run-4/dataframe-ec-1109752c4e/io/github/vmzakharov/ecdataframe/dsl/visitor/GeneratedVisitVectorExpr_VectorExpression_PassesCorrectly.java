package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitVectorExpr_VectorExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitVectorExpr_VectorExpression_PassesCorrectly() {
        VectorExpr vectorExpr = new VectorExpr(new DecimalExpr(2), new DecimalExpr(3));
        prettyPrintVisitor.visitVectorExpr(vectorExpr);
    }

}