package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedHashCodeValidVersionTest {

    @Test
    public void hashCodeValidVersionTest() {
        AppVersion appVersion = AppVersion.parseName("version.hashCode");
        Assert.assertNotEquals(0, appVersion.hashCode());
    }

}