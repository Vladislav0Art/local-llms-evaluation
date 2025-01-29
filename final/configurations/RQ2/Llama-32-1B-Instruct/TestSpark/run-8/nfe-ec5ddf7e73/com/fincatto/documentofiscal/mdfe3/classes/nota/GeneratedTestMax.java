package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedTestMax {

    @Test
    public void testMax() {
        int maxValue = getMax(100, 20);
        if (maxValue == 0) {
            throw new RuntimeException();
        }
        System.out.println(maxValue);
    }

}