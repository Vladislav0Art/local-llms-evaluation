package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        Assert.assertEquals("subscriberha", parsedName.getPackageName());
        Assert.assertEquals("1.0.0", parsedName.getVersion());
        Assert.assertEquals("h150", parsedName.getCommit());
        Assert.assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        Assert.assertEquals("150", parsedName.getBuildNumber());
    }

}