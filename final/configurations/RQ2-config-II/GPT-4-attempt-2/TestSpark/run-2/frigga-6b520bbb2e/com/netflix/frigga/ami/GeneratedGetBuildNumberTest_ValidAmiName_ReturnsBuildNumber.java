package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetBuildNumberTest_ValidAmiName_ReturnsBuildNumber {

    @Test
    public void getBuildNumberTest_ValidAmiName_ReturnsBuildNumber() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected a build number", appVersion.getBuildNumber());
    }

}