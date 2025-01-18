package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(expression);

        // Add assertions as necessary in order to test the functionality of your method
    }

}