package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitDecimalExpr_DecimalExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitDecimalExpr_DecimalExpression_PassesCorrectly() {
        DecimalExpr decimalExpr = new DecimalExpr(2);
        prettyPrintVisitor.visitDecimalExpr(decimalExpr);
    }

}