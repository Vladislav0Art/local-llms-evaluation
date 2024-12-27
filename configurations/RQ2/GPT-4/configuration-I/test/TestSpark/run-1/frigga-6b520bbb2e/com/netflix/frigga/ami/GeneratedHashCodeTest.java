package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        String amiName = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion = AppVersion.parseName(amiName);

        Assert.assertEquals(appVersion.hashCode(), appVersion.hashCode());
    }

}