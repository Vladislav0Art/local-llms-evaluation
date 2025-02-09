package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTrueTest {

    @Test
    public void equalsTrueTest() {
        AppVersion version1 = AppVersion.parseName("name1");
        AppVersion version2 = AppVersion.parseName("name1");
        Assert.assertTrue(version1.equals(version2));
    }

}