package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        String amiName1 = "AppName-buildJob1-v001-001-commit1";
        String amiName2 = "AppName-buildJob1-v001-001-commit1";

        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        AppVersion appVersion2 = AppVersion.parseName(amiName2);

        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}