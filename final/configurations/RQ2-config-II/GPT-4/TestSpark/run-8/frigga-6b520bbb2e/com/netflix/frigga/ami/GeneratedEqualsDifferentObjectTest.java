package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = new AppVersion("test-1.0.0-22");
        AppVersion appVersion2 = new AppVersion("test-1.0.0-23");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}