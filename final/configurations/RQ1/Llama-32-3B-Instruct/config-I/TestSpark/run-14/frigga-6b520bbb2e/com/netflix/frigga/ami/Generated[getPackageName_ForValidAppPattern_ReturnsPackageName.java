package com.netflix.frigga.ami;

public class Generated[

getPackageName_ForValidAppPattern_ReturnsPackageName {

    @Test
    public void [getPackageName_ForValidAppPattern_ReturnsPackageName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName.getPackageName());
    }

}