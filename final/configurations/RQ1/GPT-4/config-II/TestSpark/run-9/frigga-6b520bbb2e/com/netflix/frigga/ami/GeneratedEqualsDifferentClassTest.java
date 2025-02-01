package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentClassTest {

    @Test
    public void equalsDifferentClassTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        Assert.assertFalse(appVersion.equals(new Object()));
    }

}