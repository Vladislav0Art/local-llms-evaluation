package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobNameByName {

    @Test
    public void testGetBuildJobNameByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getBuildJobName(), "ami-1234567890abcdef");
    }

}