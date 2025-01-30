package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public BinaryOpStub(Expression operand1, Expression operand2) {
        super(operand1, operand2);
    }

    @Override
    public String getOperatorSymbolOrName() {
        return "+";
    }

    @Override
    public Value apply(Value v1, Value v2) {
        return v1.add(v2);
    }
}

public class PrettyPrintVisitorTest {

    @Test
    public void visitConstExprLongTest() {
        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
        Value val = new LongValue(99L);
        val.accept(ppv);
        assertEquals("99", ppv.toString());
    }

}