package com.netflix.frigga.ami;

public class Generated[

getVersion_ForValidAppPattern_ReturnsVersion {

    @Test
    public void [getVersion_ForValidAppPattern_ReturnsVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName.getVersion());
    }

}