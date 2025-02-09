package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("validAmiName_2");
        String result = appVersion.toString();
        Assert.assertNotNull(result);
    }

}