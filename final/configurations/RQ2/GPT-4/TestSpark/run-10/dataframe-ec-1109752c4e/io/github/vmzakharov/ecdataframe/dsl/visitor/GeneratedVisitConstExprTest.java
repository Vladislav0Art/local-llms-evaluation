package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        DecimalValue decimalValue = new DecimalValue(new BigDecimal(10.5));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();

        assertNotNull(visitor.visitConstExpr(decimalValue));
    }

}