package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName_WithSpaces {

    @Test
    public void testGetBuildJobName_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getBuildJobName(), "ami 1234567890abcdef");
    }
}

}