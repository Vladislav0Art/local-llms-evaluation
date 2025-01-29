package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTimesMultiple {

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