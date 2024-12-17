package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private static String amiName;

    @Test
    public void TestGetBuildJobName() {
        when(parseName.amiName()).thenReturn("job1");
        assertEquals("job1", appVersion.getBuildJobName());
    }

}