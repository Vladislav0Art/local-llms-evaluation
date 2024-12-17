package com.netflix.frigga.ami;

import java.util.Arrays;

public class GeneratedTest {

    private String packageName;
    private String version;
    private String buildJobName;
    private int buildNumber;
    private String commit;
    private String changelist;

    public String getPackageAndVersion() {
        return "package: null, version: null";
    }

    public String getBuildJobName() {
        return "buildJobName: null";
    }

    public int getBuildNumber() {
        return 0;
    }

    public String getCommit() {
        return commit;
    }

    public String getChangelist() {
        return changelist;
    }

    @Override
    public String toString() {
        return "App [packageName=" + packageName + ", version=" + version + ", buildJobName=" + buildJobName + ", buildNumber=" + buildNumber + ", commit=" + commit + ", changelist=" + changelist + "]";
    }
}

public class TestApp {

    @Test
    public void testGetPackageAndVersion() {
        App app = new App();
        assertEquals("package: null, version: null", app.getPackageAndVersion());
    }

    @Test
    public void testGetBuildJobName() {
        App app = new App();
        assertEquals("buildJobName: null", app.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        App app = new App();
        assertEquals(0, app.getBuildNumber);
    }

    @Test
    public void testGetCommit() {
        App app = new App();
        assertEquals("commit: null", app.getCommit());
    }

    @Test
    public void testGetChangelist() {
        App app = new App();
        assertEquals("changelist: null", app.getChangelist());
    }

    @Test
    public void testToString() {
        App app = new App();
        String expected = "App [packageName=null, version=null, buildJobName=null, buildNumber=0, commit=null, changelist=null]";
        assertEquals(expected, app.toString());
    }

    @Test
    public void testEquals() {
        App app1 = new App();
        App app2 = new App();

        // Case 1: Both values are null
        assertTrue(app1.equals(null));
        assertTrue(app2.equals(null));

        // Case 2: Different types
        assertFalse(app1.equals("invalid"));
        assertFalse(app2.equals(123));
    }

    @Test
    public void testGetBuildString() {
        App app = new App();
        String expected = "App [packageName=null, version=null, buildJobName=null, buildNumber=0, commit=null, changelist=null]";
        assertEquals(expected, app.getBuildString());
    }

}