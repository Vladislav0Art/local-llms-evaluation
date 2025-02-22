package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTest {

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.compareTo(appVersion2);
        verify(appVersion1, times(1)).compareTo(appVersion2);
    }

    @Test
    public void testNullSafeStringComparator() {
        AppVersion appVersion = new AppVersion();
        String one = "test1";
        String two = "test2";
        int result = appVersion.nullSafeStringComparator(one, two);
        assertEquals(result, one.compareTo(two));
    }

    @Test
    public void testGetAppVersionPattern() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        String packageName = "test";
        appVersion.packageName = packageName;
        String resultPackageName = appVersion.getPackageName();
        assertEquals(packageName, resultPackageName);
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        String version = "1.0.0";
        appVersion.version = version;
        String resultVersion = appVersion.getVersion();
        assertEquals(version, resultVersion);
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        String buildJobName = "testJob";
        appVersion.buildJobName = buildJobName;
        String resultBuildJobName = appVersion.getBuildJobName();
        assertEquals(buildJobName, resultBuildJobName);
    }

}