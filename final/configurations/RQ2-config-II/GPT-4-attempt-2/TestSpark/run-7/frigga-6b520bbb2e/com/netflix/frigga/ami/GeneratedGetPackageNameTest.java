package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("appversion-test");
        Assert.assertNotNull(version.getPackageName());
    }

}