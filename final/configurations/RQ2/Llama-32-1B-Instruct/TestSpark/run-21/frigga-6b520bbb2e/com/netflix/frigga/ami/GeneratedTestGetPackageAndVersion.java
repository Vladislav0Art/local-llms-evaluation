package com.netflix.frigga.ami;

import com.netflix.frigga.AppVersion;

public class GeneratedTestGetPackageAndVersion {

    @BeforeEach
    public void setup() {
        AppVersion.parseName("my-ami-name");
    }

    @Test
    public void testGetPackageAndVersion() {
        System.out.println(AppVersion.getPackageAndVersion("1234567890abcdef"));
    }

}