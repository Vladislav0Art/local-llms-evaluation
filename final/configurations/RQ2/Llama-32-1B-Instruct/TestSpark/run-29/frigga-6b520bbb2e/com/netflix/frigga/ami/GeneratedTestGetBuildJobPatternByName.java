package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobPatternByName {

    @Test
    public void testGetBuildJobPatternByName() {
        AppVersion.appVersionPattern = AppVersion.buildJobPattern();
        assertEquals(AppVersion.buildJobPattern(), AppVersion Pattern);
    }

}