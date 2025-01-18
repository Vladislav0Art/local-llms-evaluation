package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsDifferentVersionsTest {

    @Test
    public void equalsDifferentVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version2");
        Assert.assertNotEquals(thisVersion, otherVersion);
    }

}