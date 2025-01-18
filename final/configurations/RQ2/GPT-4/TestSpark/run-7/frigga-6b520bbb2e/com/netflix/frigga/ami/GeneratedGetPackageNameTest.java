package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        String packageName = "package1";
        AppVersion appVersion = AppVersion.parseName(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}