package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEvaluateExpressionTest {

    @Test
    public void evaluateExpressionTest() {
        DataFrame dataFrame = mock(DataFrame.class);
        Expression expression = mock(Expression.class);
        when(dataFrame.evaluateExpression(expression, 0)).thenReturn(mock(Value.class));
        assertNotNull(dataFrame.evaluateExpression(expression, 0));
    }

}