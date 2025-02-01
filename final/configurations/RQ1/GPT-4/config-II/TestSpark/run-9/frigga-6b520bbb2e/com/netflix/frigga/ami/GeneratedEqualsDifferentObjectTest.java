package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        AppVersion appVersion2 = AppVersion.parseName("packageName-1.2.3-h124/commits/13");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}