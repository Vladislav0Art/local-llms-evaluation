package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedTest {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void givenAMINullReturnsNull() {
        assertEquals(null, parseName(null));
    }

    @Test
    public void givenInvalidAMITagReturnsNull() {
        assertEquals(null, parseName(" invalid"));
    }

    @Test
    public void givenValidAMITagMatchesPattern() {
        Matcher matcher = Pattern.compile(
                "([" + AppVersion.NameConstants.NAME_HYPHEN_CHARS
                        + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + AppVersion.NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?").matcher("subscriberha-1.0.0-h150");
        assertTrue(matcher.matches());
    }

    @Test
    public void givenValidAMITagMatchesPatternWithCommit() {
        Matcher matcher = Pattern.compile(
                "([" + AppVersion.NameConstants.NAME_HYPHEN_CHARS
                        + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + AppVersion.NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?").matcher("subscriberha-1.0.0-h150");
        assertTrue(matcher.matches());
    }

    @Test
    public void givenAMITagWithoutCommitReturnsNull() {
        assertEquals(null, parseName("subscriberha-1.0.0"));
    }

    @Test
    public void testGetPackageName() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("packageName");
        field.setAccessible(true);
        field.set(appVersion, "my-package");

        assertEquals("my-package", appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("version");
        field.setAccessible(true);
        field.set(appVersion, "1.0");

        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("buildJobName");
        field.setAccessible(true);
        field.set(appVersion, "my-job");

        assertEquals("my-job", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("buildNumber");
        field.setAccessible(true);
        field.set(appVersion, "123");

        assertEquals("123", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("commit");
        field.setAccessible(true);
        field.set(appVersion, "my-commit");

        assertEquals("my-commit", appVersion.getCommit());
    }

    @Test
    public void testGetChangelist() {
        assertThrows(NullPointerException.class, () -> new AppVersion().getChangelist());
    }

}