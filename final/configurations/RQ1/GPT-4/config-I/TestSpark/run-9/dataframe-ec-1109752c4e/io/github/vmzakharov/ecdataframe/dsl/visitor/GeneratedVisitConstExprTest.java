package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        String stringValue = "Hello, world!";
        StringValue stringExpr = new StringValue(stringValue);

        String resultString = PrettyPrintVisitor.exprToString(stringExpr);

        Assert.assertEquals("\"" + stringValue + "\"", resultString);

        BigDecimal decimalValue = BigDecimal.valueOf(100.5);
        DecimalValue decimalExpr = new DecimalValue(decimalValue);

        String resultDecimal = PrettyPrintVisitor.exprToString(decimalExpr);

        Assert.assertEquals(decimalValue.toString(), resultDecimal);
    }

}