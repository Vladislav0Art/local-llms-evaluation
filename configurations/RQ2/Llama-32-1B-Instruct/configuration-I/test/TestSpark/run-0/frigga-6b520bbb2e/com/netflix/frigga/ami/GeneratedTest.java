package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedTest {

    @Mock
    private Pattern pattern;

    @Spy
    private AppVersion appVersion;

    @InjectMocks
    private AppVersion appVersion2;

    @Test
    public void testParseName() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);
        assertEquals("ami-name", parsedVersion.getPackageName());
    }

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        when(appVersion.compareTo(appVersion2)).thenReturn(-1);

        int result = appVersion.compare(appVersion1, appVersion2);
        assertEquals(-1, result);
    }

    @Test
    public void testGetPackageName() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);

        assertEquals("ami-name", parsedVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);
        assertEquals("1.0.0", parsedVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);

        assertEquals("build-job-name", parsedVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);
        assertEquals("1.0.0", parsedVersion.getVersion());
    }

    @Test
    public void testGetCommit() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);

        assertEquals("commit-hash", parsedVersion.getCommit());
    }

    @Test
    public void testGetChangelist() {
        String amiName = "ami-name";
        AppVersion parsedVersion = appVersion.parseName(amiName);
        assertEquals("", parsedVersion.getChangelist());
    }

    @Test
    public void testToString() {
        String amiName = "ami-name";

        when(appVersion.toString()).thenReturn("ami-name");
        assertEquals("ami-name", appVersion.toString());
    }

    @Test
    public void testGetHashCode() {
        AppVersion parsedVersion = appVersion.parseName("ami-name");

        assertEquals(12345, parsedVersion.hashCode());
    }

    @Test
    public void testEquals() {
        String amiName = "ami-name";

        when(appVersion.equals(new Object())).thenReturn(false);
        when(appVersion2.equals(appVersion)).thenReturn(true);

        assertTrue(appVersion.equals(appVersion2));
        assertFalse(appVersion.equals("ami-name"));
    }

}