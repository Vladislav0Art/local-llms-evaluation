package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidAmiName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String validName = NameConstants.LATEST_AMI_NAME;
        AppVersion appVersion = AppVersion.parseName(validName);
        assertNotNull(appVersion);
    }

}