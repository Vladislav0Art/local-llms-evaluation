package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Pattern pattern;

    @Test
    public void parseName_MatchPattern_ReturnsAppVersion() {
        when(pattern.matcher(NameConstants.AMI_NAME)).thenReturn(Matcher.matches());
        AppVersion appVersion = AppVersion.parseName(NameConstants.AMI_NAME);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_NoMatch_ReturnsNull() {
        when(pattern.matcher("non-matching-name")).thenReturn(Matcher.reset());
        AppVersion appVersion = AppVersion.parseName("non-matching-name");
        assertNull(appVersion);
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_DifferentPackageVersions_ReturnsCompareResult() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("different-package");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageName

    ReturnsExpectedPackage() {
        String packageName = "test-package";
        AppVersion appVersion = new AppVersion(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsExpectedVersion() {
        String version = "1.0.0";
        AppVersion appVersion = new AppVersion(version);
        assertEquals(version, appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsExpectedBuildJobName() {
        String buildJobName = "test-build-job-name";
        AppVersion appVersion = new AppVersion(buildJobName);
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber

    ReturnsExpectedBuildNumber() {
        String buildNumber = "12345";
        AppVersion appVersion = new AppVersion(buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

    @Test
    public void getCommit

    ReturnsExpectedCommit() {
        String commit = "test-commit-hash";
        AppVersion appVersion = new AppVersion(commit);
        assertEquals(commit, appVersion.getCommit());
    }

    @Test
    public void getChangelist_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getChangelist());
    }

    @Test
    public void toString_ReturnsExpectedToString() {
        String expectedString = "test-version-string";
        AppVersion appVersion = new AppVersion(expectedString);
        assertEquals(expectedString, appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsExpectedHashCode() {
        int expectedHashcode = 12345;
        AppVersion appVersion = new AppVersion("expected-hash-value");
        assertEquals(expectedHashcode, appVersion.hashCode());
    }

    @Test
    public void equals_ObjectIsSameReturnsTrue() {
        AppVersion obj1 = new AppVersion();
        AppVersion obj2 = obj1;
        assertTrue(obj1.equals(obj2));
    }

    @Test
    public void equals_ObjectIsDifferentReturnsFalse() {
        AppVersion obj1 = new AppVersion();
        AppVersion obj2 = new AppVersion("different-value");
        assertFalse(obj1.equals(obj2));
    }

}