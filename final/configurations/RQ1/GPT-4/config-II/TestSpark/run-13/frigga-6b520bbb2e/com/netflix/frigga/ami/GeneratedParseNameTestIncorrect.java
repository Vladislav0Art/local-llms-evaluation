package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedParseNameTestIncorrect {

    @Test
    public void parseNameTestIncorrect() {
        AppVersion appVersion = AppVersion.parseName("incorrect.name");
        assertEquals(null, appVersion);
    }

}