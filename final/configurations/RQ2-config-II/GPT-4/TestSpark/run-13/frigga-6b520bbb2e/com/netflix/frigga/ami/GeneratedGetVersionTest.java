package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        String amiName = "packageName-1.0.0-h12.abcdefg";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertEquals("1.0.0", result.getVersion());
    }

}