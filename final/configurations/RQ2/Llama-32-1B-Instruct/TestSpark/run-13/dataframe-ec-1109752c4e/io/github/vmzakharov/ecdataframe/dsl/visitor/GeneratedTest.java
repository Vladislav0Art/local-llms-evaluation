package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

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

    @Test
    public void testTimesMultiple() {
        IndexExpr index1 = new IndexExpr("x", 5);
        IndexExpr index2 = new IndexExpr("y", 10);
        DecimalExpr decimal1 = new DecimalExpr(1000);

        ifElseExpr ifElse = new IfElseExpr();
        ifElse.add(index1, true, "X");
        ifElse.add(index2, false, "Y");

        DecimalExpr times3 = times(ifElse, decimal1);

        assertEquals("XYZ", String.format("%10s%4d", ifElse.toString(), times3.getValue()));
    }

}