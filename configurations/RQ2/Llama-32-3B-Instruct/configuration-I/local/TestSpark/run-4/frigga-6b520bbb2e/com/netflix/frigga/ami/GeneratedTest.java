package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void parseName_ValidAMIName_ReturnsAppVersion() {
        String amiName = "1.2.3-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(appVersion, new AppVersion("1.2.3", "abcde"));
    }

    @Test
    public void parseName_InvalidAMIName_ReturnsNull() {
        String amiName = "invalid-amitext";
        assertNull(AppVersion.parseName(amiName));
    }

    @Test
    public void compareTo_AppVersionWithSameValue_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.3", "abcde");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_AppVersionWithLowerValue_ReturnsNegative() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.4", "abcdz");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_AppVersionWithHigherValue_ReturnsPositive() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.2", "abcdy");
        assertEquals(1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^\\d+\\.\\d+\\.\\d+-[a-zA-Z0-9]+$"));
        assertEquals(true, getAppVersionPattern().matcher("1.2.3-abcde").matches());
    }

    @Test
    public void getPackageName_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion("1.2.3", "abcde");
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsAppVersionValue() {
        AppVersion appVersion = new AppVersion("1.2.3", "abcde");
        assertEquals("1.2.3", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion("1.2.3", "abcde");
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion("1.2.3", "abcde");
        assertNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsGitHashValue() {
        AppVersion appVersion = new AppVersion("1.2.3-abcde", null);
        assertEquals("abcde", appVersion.getCommit());
    }

    @Test
    public void getChangelist_ReturnsDeprecatedMethodCall() {
        AppVersion appVersion = new AppVersion("1.2.3-abcde", null);
        verify(getAppVersionPattern()).matcher(anyString()).times(0); // should never be called
    }

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        AppVersion appVersion = new AppVersion("1.2.3", "abcde");
        assertEquals("AppVersion[1.2.3, abcde]", appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsCorrectHashCodeValue() {
        AppVersion appVersion = new AppVersion("1.2.3", "abcde");
        int expectedHashCode = 1234;
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

    @Test
    public void equals_AppVersionWithSameValues_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.3", "abcde");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_AppVersionWithDifferentValues_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = new AppVersion("1.2.4", "abcdz");
        assertFalse(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_NullValue_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.2.3", "abcde");
        AppVersion appVersion2 = null;
        assertFalse(appVersion1.equals(appVersion2));
    }

}