package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetVersionTest_ValidAmiName_ReturnsVersion {

    @Test
    public void getVersionTest_ValidAmiName_ReturnsVersion() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected a version", appVersion.getVersion());
    }

}