package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTest_invalidInput {

    @Test
    public void parseNameTest_invalidInput() {
        String amiName = "invalidInput";
        AppVersion appVersion = AppVersion.parseName(amiName);

        assertNull(appVersion);
    }

}