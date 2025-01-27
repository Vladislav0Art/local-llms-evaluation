package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitPropertyPathExpr_PropertyPathExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitPropertyPathExpr_PropertyPathExpression_PassesCorrectly() {
        PropertyPathExpr propertyPathExpr = new PropertyPathExpr("a.b.c", new DecimalExpr(2));
        prettyPrintVisitor.visitPropertyPathExpr(propertyPathExpr);
    }

}