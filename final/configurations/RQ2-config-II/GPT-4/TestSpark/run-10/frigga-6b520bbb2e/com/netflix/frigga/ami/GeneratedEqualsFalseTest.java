package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-1.0.0-10-h123");
        AppVersion appVersion2 = AppVersion.parseName("name-1.0.1-10-h123");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}