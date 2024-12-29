package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_DifferentNames_ReturnsParsedAppVersion {

    @Test
    public void parseName_DifferentNames_ReturnsParsedAppVersion() {
        String amiName = "ami-abc123def456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}