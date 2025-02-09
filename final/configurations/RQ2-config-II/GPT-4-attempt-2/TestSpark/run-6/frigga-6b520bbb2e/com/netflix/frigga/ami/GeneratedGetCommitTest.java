package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String commit = appVersion.getCommit();
        Assert.assertNotNull(commit);
    }

}