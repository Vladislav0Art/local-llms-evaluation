package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTest_nullInput {

    @Test
    public void parseNameTest_nullInput() {
        AppVersion appVersion = AppVersion.parseName(null);

        assertNull(appVersion);
    }

}