package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionCallExpr_FunctionCallExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitFunctionCallExpr_FunctionCallExpression_PassesCorrectly() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr(new VarExpr("a"), "function");
        prettyPrintVisitor.visitFunctionCallExpr(functionCallExpr);
    }

}