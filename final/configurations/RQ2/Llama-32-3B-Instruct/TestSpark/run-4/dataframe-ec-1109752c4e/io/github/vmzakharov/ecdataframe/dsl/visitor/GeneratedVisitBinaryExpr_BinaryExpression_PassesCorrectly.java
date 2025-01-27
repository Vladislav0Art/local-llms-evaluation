package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitBinaryExpr_BinaryExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitBinaryExpr_BinaryExpression_PassesCorrectly() {
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), "+", new DecimalExpr(2));
        prettyPrintVisitor.visitBinaryExpr(binaryExpr);
    }

}