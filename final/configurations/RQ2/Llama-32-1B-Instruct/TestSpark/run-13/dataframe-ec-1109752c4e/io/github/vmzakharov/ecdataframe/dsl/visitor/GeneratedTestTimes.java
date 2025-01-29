package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTimes {

    @Test
    public void testTimes() {
        DecimalExpr decimal1 = new DecimalExpr(10);
        DecimalExpr decimal2 = new DecimalExpr(20);
        DecimalExpr times = times(decimal1, decimal2);

        DecimalExpr decimal3 = new DecimalExpr(1000);
        DecimalExpr decimal4 = new DecimalExpr(2000);
        DecimalExpr times2 = times(decimal3, decimal4);

        assertEquals(20000000L, times2.getValue(), 10000);
    }

}