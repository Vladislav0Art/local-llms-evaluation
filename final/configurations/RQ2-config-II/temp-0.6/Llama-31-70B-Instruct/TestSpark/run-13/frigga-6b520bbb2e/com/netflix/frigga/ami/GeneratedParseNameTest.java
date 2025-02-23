package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        Assert.assertEquals("subscriberha", parsedName.getPackageName());
        Assert.assertEquals("1.0.0", parsedName.getVersion());
        Assert.assertEquals("WE-WAPP-subscriberha", parsedName.getBuildJobName());
        Assert.assertEquals("150", parsedName.getBuildNumber());
        Assert.assertEquals("h150", parsedName.getCommit());
    }

}