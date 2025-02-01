package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsSameValuesTest {

    @Test
    public void equalsSameValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        AppVersion appVersion2 = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}