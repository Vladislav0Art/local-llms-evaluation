package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprUnaryExprTest {

    public BinaryOpStub(Expression operand1, Expression operand2) {
        super(operand1, operand2);
    }

    @Override
    public Operation getOperation() {
        return Operation.ADD;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        if (visitor instanceof PrettyPrintVisitor) {
            PrettyPrintVisitor prettyPrintVisitor = (PrettyPrintVisitor) visitor;
            prettyPrintVisitor.print("(")
                    .printExpression(getOperand1())
                    .print(" + ")
                    .printExpression(getOperand2())
                    .print(")");
        } else {
            super.accept(visitor);
        }
    }
}

public class PrettyPrintVisitorTest {

    @Test
    public void visitBinaryExprUnaryExprTest() {
        BinaryOpStub expr = new BinaryOpStub(new VarExpr("y"), new IntValue(2));
        String result = PrettyPrintVisitor.exprToString(expr);
        assertEquals("(y + 2)", result);
    }

}