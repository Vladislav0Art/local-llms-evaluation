package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsNotEqualVersionTest {

    @Test
    public void equalsNotEqualVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("version1");
        AppVersion appVersion2 = AppVersion.parseName("version2");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}