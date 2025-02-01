package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        Assert.assertEquals("12", appVersion.getCommit());
    }

}