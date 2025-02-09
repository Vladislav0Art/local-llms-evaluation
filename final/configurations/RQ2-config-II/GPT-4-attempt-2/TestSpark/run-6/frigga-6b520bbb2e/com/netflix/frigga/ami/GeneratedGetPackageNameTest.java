package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        String amiName = "name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String packageName = appVersion.getPackageName();
        Assert.assertNotNull(packageName);
    }

}