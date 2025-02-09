package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        AppVersion version1 = AppVersion.parseName("name1");
        AppVersion version2 = AppVersion.parseName("name2");
        Assert.assertFalse(version1.equals(version2));
    }

}