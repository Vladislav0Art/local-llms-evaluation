package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetPackageNameTest_ValidAmiName_ReturnsPackageName {

    @Test
    public void getPackageNameTest_ValidAmiName_ReturnsPackageName() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected a package name", appVersion.getPackageName());
    }

}