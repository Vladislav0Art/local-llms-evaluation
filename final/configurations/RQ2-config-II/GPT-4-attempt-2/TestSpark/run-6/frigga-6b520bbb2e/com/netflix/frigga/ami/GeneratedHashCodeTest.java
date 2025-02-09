package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        int hash = appVersion.hashCode();
        Assert.assertTrue(hash != 0);
    }

}