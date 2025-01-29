package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern_InvalidInput {

    @Test
    public void testGetAppVersionPattern_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.Pattern);
    }
}

}