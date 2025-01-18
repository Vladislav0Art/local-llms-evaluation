package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsSameVersionsTest {

    @Test
    public void equalsSameVersionsTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        AppVersion otherVersion = AppVersion.parseName("version1");
        Assert.assertEquals(thisVersion, otherVersion);
    }

}