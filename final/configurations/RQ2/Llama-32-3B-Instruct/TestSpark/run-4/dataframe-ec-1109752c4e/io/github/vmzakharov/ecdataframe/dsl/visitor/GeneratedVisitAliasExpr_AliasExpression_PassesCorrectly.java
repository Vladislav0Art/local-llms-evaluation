package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitAliasExpr_AliasExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitAliasExpr_AliasExpression_PassesCorrectly() {
        AliasExpr aliasExpr = new AliasExpr("a", new VarExpr("b"));
        prettyPrintVisitor.visitAliasExpr(aliasExpr);
    }

}