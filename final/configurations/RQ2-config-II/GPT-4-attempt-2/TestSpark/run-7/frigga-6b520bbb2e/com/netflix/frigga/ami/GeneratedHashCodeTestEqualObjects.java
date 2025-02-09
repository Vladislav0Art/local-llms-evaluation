package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTestEqualObjects {

    @Test
    public void hashCodeTestEqualObjects() {
        AppVersion version = AppVersion.parseName("appversion-test");
        AppVersion anotherVersion = AppVersion.parseName("appversion-test");
        Assert.assertEquals(version.hashCode(), anotherVersion.hashCode());
    }

}