package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameEmptyAmiNameTest {

    @Test
    public void parseNameEmptyAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName("");
        assertNull(appVersion);
    }

}