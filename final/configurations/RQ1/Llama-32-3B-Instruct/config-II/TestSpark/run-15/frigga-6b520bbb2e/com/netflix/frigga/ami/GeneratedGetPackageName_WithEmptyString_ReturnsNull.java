package com.netflix.frigga.ami;

public class GeneratedGetPackageName_WithEmptyString_ReturnsNull {

    @Test
    public void getPackageName_WithEmptyString_ReturnsNull() {
        // given
        AppVersion parsedAppVersion = new AppVersion("", "", "", "");
        // when
        String packageName = parsedAppVersion.getPackageName();
        // then
        Assert.assertNull(packageName);
    }

}