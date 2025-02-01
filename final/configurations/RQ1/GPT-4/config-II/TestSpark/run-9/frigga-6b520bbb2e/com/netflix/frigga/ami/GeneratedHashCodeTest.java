package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        Assert.assertEquals(896286367, appVersion.hashCode());
    }

}