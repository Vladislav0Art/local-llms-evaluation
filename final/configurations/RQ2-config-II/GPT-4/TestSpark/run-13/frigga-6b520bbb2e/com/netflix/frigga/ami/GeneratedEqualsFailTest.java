package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedEqualsFailTest {

    @Test
    public void equalsFailTest() {
        String amiName1 = "packageName-1.0.0-h12.abcdefg";
        AppVersion result1 = AppVersion.parseName(amiName1);
        String amiName2 = "packageName-2.0.0-h13.hijklmn";
        AppVersion result2 = AppVersion.parseName(amiName2);
        Assert.assertFalse(result1.equals(result2));
    }

}