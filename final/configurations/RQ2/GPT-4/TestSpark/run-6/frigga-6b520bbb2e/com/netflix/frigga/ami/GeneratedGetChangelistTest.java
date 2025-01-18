package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1.1-commit1-changelist1");
        Assert.assertEquals("changelist1", appVersion.getChangelist());
    }

}