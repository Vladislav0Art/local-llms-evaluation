package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedEqualsDifferentInstanceTest {

    @Test
    public void equalsDifferentInstanceTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        AppVersion appVersion2 = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}