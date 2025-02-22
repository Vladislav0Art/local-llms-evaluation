package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(name);
        Assert.assertEquals("subscriberha", appVersion.getPackageName());
        Assert.assertEquals("1.0.0", appVersion.getVersion());
        Assert.assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
        Assert.assertEquals("586499", appVersion.getBuildNumber());
        Assert.assertEquals("150", appVersion.getCommit());
    }

}