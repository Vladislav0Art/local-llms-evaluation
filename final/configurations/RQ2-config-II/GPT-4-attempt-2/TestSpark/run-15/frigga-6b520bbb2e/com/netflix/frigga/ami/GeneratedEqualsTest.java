package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion version1 = AppVersion.parseName("validAmiName_2");
        AppVersion version2 = AppVersion.parseName("validAmiName_2");
        Assert.assertTrue(version1.equals(version2));
    }

}