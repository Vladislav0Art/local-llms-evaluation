package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.junit.Test;

import static org.mockito.Mockito.verify;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        Value ifTrueValue = new DecimalValue(BigDecimal.ONE);
        Value ifFalseValue = new DecimalValue(BigDecimal.TEN);
        Expr ifCondition = new ConstExpr(new BooleanValue(true));
        IfElseExpr ifElseExpr = new IfElseExpr(ifCondition, ifTrueValue, ifFalseValue);

        Printer printer = Mockito.mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        ifElseExpr.accept(visitor);

        verify(printer).print(" if ");
        verify(printer).print(" then ");
        verify(printer).print(" else ");
    }

}