package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTrueTest {

    @Test
    public void equalsTrueTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-1.0.0-10-h123");
        AppVersion appVersion2 = AppVersion.parseName("name-1.0.0-10-h123");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}