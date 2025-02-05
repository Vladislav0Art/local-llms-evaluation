package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("name-1.0.0-10-h123");
        Assert.assertNotNull(appVersion.getChangelist());
    }

}