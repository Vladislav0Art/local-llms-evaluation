package com.netflix.frigga.ami;

public class Generated[

getVersion_ForInvalidAppPattern_ReturnsNull {

    @Test
    public void [getVersion_ForInvalidAppPattern_ReturnsNull() {
        String amiName = "subscriberha-1.0.0-586499 abc";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName.getVersion());
    }

}