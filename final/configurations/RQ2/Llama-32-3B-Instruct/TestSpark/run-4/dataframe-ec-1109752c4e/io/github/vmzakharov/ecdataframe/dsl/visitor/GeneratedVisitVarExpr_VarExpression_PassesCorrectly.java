package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitVarExpr_VarExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitVarExpr_VarExpression_PassesCorrectly() {
        VarExpr varExpr = new VarExpr("a");
        prettyPrintVisitor.visitVarExpr(varExpr);
    }

}