package com.netflix.frigga.ami;

public class GeneratedTestCompareToNull {

    @Test
    public void testCompareToNull() {
        AppVersion appVersion = new AppVersion();
        int result = appVersion.compareTo(null);
        Assert.assertEquals(1, result);
    }

}