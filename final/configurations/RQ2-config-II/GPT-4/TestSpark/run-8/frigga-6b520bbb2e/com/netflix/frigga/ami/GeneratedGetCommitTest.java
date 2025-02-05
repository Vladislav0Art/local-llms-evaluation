package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion("test-1.0.0-22-g123456");
        Assert.assertEquals("g123456", appVersion.getCommit());
    }

}