package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentAppVersionTest {

    @Test
    public void equalsDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("validAmi");
        AppVersion appVersion2 = AppVersion.parseName("invalidAmi");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}