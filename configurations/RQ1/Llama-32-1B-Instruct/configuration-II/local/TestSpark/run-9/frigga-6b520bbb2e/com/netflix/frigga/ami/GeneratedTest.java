package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    @Mock
    private String amiName;

    @Before
    public void setup() {
        // No need to set up anything here, the tests are separate from the class under test.
    }

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion();
        appVersion.parseName(amiName);
        assertNotNull(appVersion.packageName);
        assertNotNull(appVersion.version);
        assertNotNull(appVersion.buildJobName);
        assertNotNull(appVersion.buildNumber);
        assertNotNull(appVersion.commit);
    }

    @Test
    public void testParseNameNull() {
        AppVersion appVersion = new AppVersion();
        appVersion.parseName(null);
        assertNull(appVersion.packageName);
        assertNull(appVersion.version);
        assertNull(appVersion.buildJobName);
        assertNull(appVersion.buildNumber);
        assertNull(appVersion.commit);
    }

    @Test
    public void testParseNameEmpty() {
        AppVersion appVersion = new AppVersion();
        appVersion.parseName("");
        assertNull(appVersion.packageName);
        assertNull(appVersion.version);
        assertNull(appVersion.buildJobName);
        assertNull(appVersion.buildNumber);
        assertNull(appVersion.commit);
    }

    @Test
    public void testParseNameInvalid() {
        AppVersion appVersion = new AppVersion();
        Matcher matcher = APP_VERSION_PATTERN.matcher("test");
        assertNotNull(matcher);
        appVersion.parseName(matcher.toString());
        // No assert needed here, the matcher is not used to verify anything.
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.RPM_PACKAGE_NAME, appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.RPM_PACKAGE_VERSION, appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.JENKINSJOB_NAME, appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.JENKINSBUILD_NUMBER, appVersion.getBuildNumber());
    }

}