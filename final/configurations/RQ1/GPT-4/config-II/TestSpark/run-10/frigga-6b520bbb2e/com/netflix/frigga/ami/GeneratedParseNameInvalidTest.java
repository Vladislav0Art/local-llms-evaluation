package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidTest {

    @Test
    public void parseNameInvalidTest() {
        String invalidAppName = "invalid-subscriberha-h1.0.0-586499";

        AppVersion testedVersion = AppVersion.parseName(invalidAppName);

        assertNull(testedVersion);
    }

}