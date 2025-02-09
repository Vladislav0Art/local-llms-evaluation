package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsEqualVersionTest {

    @Test
    public void equalsEqualVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("version1");
        AppVersion appVersion2 = AppVersion.parseName("version1");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}