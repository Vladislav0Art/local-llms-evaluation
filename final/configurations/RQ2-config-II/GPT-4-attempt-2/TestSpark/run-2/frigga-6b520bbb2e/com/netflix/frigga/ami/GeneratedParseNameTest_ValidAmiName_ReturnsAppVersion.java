package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedParseNameTest_ValidAmiName_ReturnsAppVersion {

    @Test
    public void parseNameTest_ValidAmiName_ReturnsAppVersion() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected AppVersion object", appVersion);
    }

}