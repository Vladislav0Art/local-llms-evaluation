package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedEqualsSameInstanceTest {

    @Test
    public void equalsSameInstanceTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertTrue(appVersion.equals(appVersion));
    }

}