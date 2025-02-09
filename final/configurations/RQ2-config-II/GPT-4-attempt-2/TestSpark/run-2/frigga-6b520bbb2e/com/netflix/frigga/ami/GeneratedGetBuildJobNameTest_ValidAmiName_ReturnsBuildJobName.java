package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetBuildJobNameTest_ValidAmiName_ReturnsBuildJobName {

    @Test
    public void getBuildJobNameTest_ValidAmiName_ReturnsBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected a build job name", appVersion.getBuildJobName());
    }

}