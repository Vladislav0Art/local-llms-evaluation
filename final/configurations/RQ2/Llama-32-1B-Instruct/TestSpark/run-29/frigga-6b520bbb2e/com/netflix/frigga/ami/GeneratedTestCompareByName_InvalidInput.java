package com.netflix.frigga.ami;

public class GeneratedTestCompareByName_InvalidInput {

    @Test
    public void testCompareByName_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.compareNames(null, null));
    }
}

}