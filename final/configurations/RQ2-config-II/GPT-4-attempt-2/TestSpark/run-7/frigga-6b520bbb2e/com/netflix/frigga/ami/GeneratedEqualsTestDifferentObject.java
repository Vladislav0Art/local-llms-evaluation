package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTestDifferentObject {

    @Test
    public void equalsTestDifferentObject() {
        AppVersion version = AppVersion.parseName("appversion-test");
        AppVersion anotherVersion = AppVersion.parseName("appversion-test1");
        Assert.assertFalse(version.equals(anotherVersion));
    }

}