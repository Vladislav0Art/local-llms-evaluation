package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals("my-package", version.getPackageName());
    }

}