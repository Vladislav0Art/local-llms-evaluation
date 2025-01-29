package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

public class GeneratedTestGetMax {

    @Test
    public void testGetMax() {
        System.out.println("getMax");
        int maxValue = getMax(100, 20);
        if (maxValue == 0) {
            throw new RuntimeException();
        }
        System.out.println(maxValue);
    }

}