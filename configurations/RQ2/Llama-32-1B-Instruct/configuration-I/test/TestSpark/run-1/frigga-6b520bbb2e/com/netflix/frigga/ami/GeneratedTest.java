package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void [AppVersion][Scenario]

    TestParseName() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        assertEquals("ami-name", appVersion.getPackageName());
    }

    @Test
    public void [AppVersion][Scenario]

    TestcompareTo() {
        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("another-ami-name");

        int result = appVersion.compareTo(appVersion2);
        assertEquals(-1, result); // should be less than
    }

    @Test
    public void [AppVersion][Scenario]

    TestGetPackageName() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String packageName = appVersion.getPackageName();
        assertEquals("ami-name", packageName);
    }

    @Test
    public void [AppVersion][Scenario]

    TestGetVersion() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String version = appVersion.getVersion();
        assertEquals("1.0.0", version); // should be "1.0.0"
    }

    @Test
    public void [AppVersion][Scenario]

    TestGetBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("build-job-name", buildJobName);
    }

    @Test
    public void [AppVersion][Scenario]

    TestGetBuildNumber() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        long buildNumber = appVersion.getBuildNumber();
        assertEquals(12345L, buildNumber); // should be 12345
    }

    @Test
    public void [AppVersion][Scenario]

    TestGetCommit() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String commit = appVersion.getCommit();
        assertEquals("commit", commit);
    }

    @Test
    public void [AppVersion][Scenario]

    TestGetChangelist() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        List<String> changelist = appVersion.getChangelist();
        assertEquals(List.of("changelist-1"), changelist); // should be "changelist-1"
    }

    @Test
    public void [AppVersion][Scenario]

    TestToString() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        String toString = appVersion.toString();
        assertEquals("ami-name", toString);
    }

    @Test
    public void [AppVersion][Scenario]

    TestHashCode() {
        AppVersion appVersion = AppVersion.parseName("ami-name");

        int result = appVersion.hashCode();
        assertEquals(12345, result); // should be 12345
    }

}