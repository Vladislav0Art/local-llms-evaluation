package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        String amiName = "subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals("150", appVersion.getCommit());
    }

}