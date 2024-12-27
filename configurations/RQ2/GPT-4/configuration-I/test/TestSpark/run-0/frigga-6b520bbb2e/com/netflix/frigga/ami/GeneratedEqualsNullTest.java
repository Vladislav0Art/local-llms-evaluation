package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("validAmi");
        Assert.assertFalse(appVersion.equals(null));
    }

}