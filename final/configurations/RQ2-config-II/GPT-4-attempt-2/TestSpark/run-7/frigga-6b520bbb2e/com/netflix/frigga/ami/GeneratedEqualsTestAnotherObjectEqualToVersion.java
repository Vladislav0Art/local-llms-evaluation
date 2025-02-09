package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTestAnotherObjectEqualToVersion {

    @Test
    public void equalsTestAnotherObjectEqualToVersion() {
        AppVersion version = AppVersion.parseName("appversion-test");
        AppVersion anotherVersion = AppVersion.parseName("appversion-test");
        Assert.assertTrue(version.equals(anotherVersion));
    }

}