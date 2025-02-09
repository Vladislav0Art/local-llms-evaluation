package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTestSameObject {

    @Test
    public void equalsTestSameObject() {
        AppVersion version = AppVersion.parseName("appversion-test");
        Assert.assertTrue(version.equals(version));
    }

}