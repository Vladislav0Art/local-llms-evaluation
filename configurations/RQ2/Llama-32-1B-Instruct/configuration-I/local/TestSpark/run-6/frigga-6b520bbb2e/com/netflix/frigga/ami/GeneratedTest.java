package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_MultipleSpaces() {
        String amiName = "appversion tag   1.0";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

    @Test
    public void parseName_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

    @Test
    public void parseName_MultipleBlankLines() {
        String amiName = "\n\nappversion tag   1.0";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

    @Test
    public void parseName_MultipleSpacesAndNewline() {
        String amiName = "appversion tag   1.0\n";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

    @Test
    public void parseName_DivideBySpace() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

    @Test
    public void parseName_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        try {
            appVersion.parseName(amiName);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void getPackageName_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_MultipleSpacesAndNewline() {
        String amiName = "\n\nappversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

    @Test
    public void getVersion_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getVersion_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getVersion());
    }

    @Test
    public void getVersion_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getVersion_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("Jenkins Job Name", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildJobName_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildJobName_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("Jenkins Job Name", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildJobName_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("Jenkins Job Name", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getBuildNumber());
    }

    @Test
    public void getBuildNumber_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildNumber());
    }

    @Test
    public void getBuildNumber_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getBuildNumber());
    }

    @Test
    public void getBuildNumber_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getCommit());
    }

    @Test
    public void getCommit_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getCommit());
    }

    @Test
    public void getCommit_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void getCommit_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void getChangelist_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getChangelist());
    }

    @Test
    public void getChangelist_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getChangelist());
    }

    @Test
    public void getChangelist_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("changelist", appVersion.getChangelist());
    }

    @Test
    public void getChangelist_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("changelist", appVersion.getChangelist());
    }

}