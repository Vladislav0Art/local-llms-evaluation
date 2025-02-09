package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTestDifferentObjects {

    @Test
    public void hashCodeTestDifferentObjects() {
        AppVersion version = AppVersion.parseName("appversion-test");
        AppVersion anotherVersion = AppVersion.parseName("appversion-test1");
        Assert.assertNotEquals(version.hashCode(), anotherVersion.hashCode());
    }

}