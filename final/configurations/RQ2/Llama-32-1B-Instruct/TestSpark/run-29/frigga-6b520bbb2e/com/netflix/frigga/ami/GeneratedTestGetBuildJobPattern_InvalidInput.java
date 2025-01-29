package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobPattern_InvalidInput {

    @Test
    public void testGetBuildJobPattern_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.Pattern);
    }
}

}