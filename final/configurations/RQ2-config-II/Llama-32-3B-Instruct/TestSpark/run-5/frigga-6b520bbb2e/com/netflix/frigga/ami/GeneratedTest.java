package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_OurApp() {
        String amiName = "my-our-app:1.0";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals("my-our-app", result.getPackageName());
        assertEquals("1.0", result.getVersion());
    }

    @Test
    public void parseName_OthersApp() {
        String amiName = "other-app:2.0";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result.getPackageName());
        assertNull(result.getVersion());
    }

    @Test
    public void compareVersions_Lower() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "0.9");
        assertEquals(-1, app1.compareTo(app2));
    }

    @Test
    public void compareVersions_Higher() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "1.9");
        assertEquals(1, app1.compareTo(app2));
    }

    @Test
    public void compareVersionsEqual() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "1.0");
        assertEquals(0, app1.compareTo(app2));
    }

    @Test
    public void getAppVersionPattern_WithRegex() {
        String patternString = "\\d+\\.\\d+";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("1.0");
        assertTrue(matcher.matches());
    }

    @Test
    public void getAppVersionPattern_WithoutRegex() {
        String patternString = ".*";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("my-our-app:1.0");
        assertTrue(matcher.matches());
    }

    @Test
    public void getPackageName_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getPackageName();
        assertEquals("my-our-app", result);
    }

    @Test
    public void getPackageName_NoValue() {
        AppVersion app = new AppVersion("", "");
        assertNull(app.getPackageName());
    }

    @Test
    public void getVersion_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getVersion();
        assertEquals("1.0", result);
    }

    @Test
    public void getVersion_NoValue() {
        AppVersion app = new AppVersion("", "");
        assertNull(app.getVersion());
    }

    @Test
    public void getBuildJobName_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getBuildJobName();
        assertEquals("build-my-our-app-1.0", result);
    }

    @Test
    public void getBuildNumber_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getBuildNumber();
        assertEquals("1.0", result);
    }

    @Test
    public void getCommit_HasValue() {
        AppVersion app = new AppVersion("", "");
        String result = app.getCommit();
        assertNull(result);
    }

    @Test
    public void getChangelist_DeprecatedButImplemented() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.getChangelist();
        assertEquals("Changes since 1.0 in my-our-app.", result);
    }

    @Test
    public void getChangelist_DeprecatedButNotImplemented() {
        AppVersion app = new AppVersion("", "");
        String result = app.getChangelist();
        assertNull(result);
    }

    @Test
    public void toString_HasValue() {
        AppVersion app = new AppVersion("my-our-app", "1.0");
        String result = app.toString();
        assertEquals("my-our-app:1.0 (build-my-our-app-1.0)", result);
    }

    @Test
    public void toString_HasEmptyValue() {
        AppVersion app = new AppVersion("", "");
        assertNull(app.toString());
    }

    @Test
    public void hashCode_HasValue() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "0.9");
        assertEquals(0, app1.hashCode());
        assertEquals(-1, app1.compareTo(app2));
    }

    @Test
    public void equals_Matches() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "0.9");
        assertTrue(app1.equals(app2));
        assertFalse(app1.equals(new Object()));
    }

    @Test
    public void equals_NonMatches() {
        AppVersion app1 = new AppVersion("my-our-app", "1.0");
        AppVersion app2 = new AppVersion("other-app", "0.9");
        assertFalse(app1.equals(app2));
        assertFalse(new Object().equals(app1));
    }

}