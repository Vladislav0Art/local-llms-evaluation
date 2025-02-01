package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        String nullAppName = null;

        AppVersion testedVersion = AppVersion.parseName(nullAppName);

        assertNull(testedVersion);
    }

}