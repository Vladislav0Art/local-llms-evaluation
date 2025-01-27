package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_WildcardPattern_ReturnsParsedAppVersionWithWildcard {

    @Test
    public void parseName_WildcardPattern_ReturnsParsedAppVersionWithWildcard() {
        String amiName = "1.0-ami.x86_64";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("x86_64", appVersion.getBuildJobName());
    }

}