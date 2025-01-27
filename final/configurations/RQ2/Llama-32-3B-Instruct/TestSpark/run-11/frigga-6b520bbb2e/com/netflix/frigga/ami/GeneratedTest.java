package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void parseNameValidName_test() {
        String amiName = "1.0-20161209T140000Z";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNotNull(parsed);
        assertEquals("1.0", parsed.getVersion());
        assertEquals("20161209T140000Z", parsed.getCommit());
    }

    @Test
    public void parseNameInvalidName_test() {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

    @Test
    public void parseNameEmptyString_test() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed);
    }

    @Test
    public void getAppVersionPatternMatch_valid_test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("1.0-20161209T140000Z");
        assertTrue(matcher.matches());
    }

    @Test
    public void getAppVersionPatternNoMatch_invalid_test() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("invalid");
        assertFalse(matcher.matches());
    }

    @Test
    public void getPackageNameValidName_test() throws Exception {
        String amiName = "1.0-20161209T140000Z";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNotNull(parsed.getPackageName());
    }

    @Test
    public void getPackageNameInvalidName_test() throws Exception {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getPackageName());
    }

    @Test
    public void getVersionValidVersion_test() {
        String amiName = "1.0-20161209T140000Z";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("1.0", parsed.getVersion());
    }

    @Test
    public void getVersionInvalidVersion_test() throws Exception {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getVersion());
    }

    @Test
    public void getCommitValidCommit_test() {
        String amiName = "1.0-20161209T140000Z";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("20161209T140000Z", parsed.getCommit());
    }

    @Test
    public void getCommitInvalidCommit_test() throws Exception {
        String amiName = "invalid";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getCommit());
    }

    @Test
    public void getBuildJobNameNullTest() throws Exception {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals(null, parsed.getBuildJobName());
    }

    @Test
    public void getCommitEmptyStringTest() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("", parsed.getCommit());
    }

    @Test
    public void getPackageNameNullTest() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getPackageName());
    }

    @Test
    public void getBuildNumberEmptyStringTest() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getBuildNumber());
    }

}