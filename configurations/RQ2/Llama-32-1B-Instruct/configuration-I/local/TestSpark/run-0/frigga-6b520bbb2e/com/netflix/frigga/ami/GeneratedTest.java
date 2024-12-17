package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testParseName_ThrowsExceptionWhenInvalidString() {
        // Arrange
        String expected = "1234567890abcdef";
        Mockito.when(AppVersion.parseName(expected)).thenAnswer(new Answer<>() {
            @Override
            public Object get() throws Exception {
                return new AppVersion();
            }
        });

        try {
            AppVersion.parseName(expected);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void testParseName_SucceedsWhenValidString() {
        // Arrange
        String expected = "1234567890abcdef";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackageName("package");
        parseName.Version("1.0");

        System.out.println(parseName.toString());
    }

    @Test
    public void testGetPackageName() {
        // Arrange
        String expected = "package";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackageName("expected");

        System.out.println(parseName.getPackageName());
    }

    @Test
    public void testGetVersion() {
        // Arrange
        String expected = "1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setVersion("expected");

        System.out.println(parseName.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        // Arrange
        String expected = "buildJob";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setBuildJobName("expected");

        System.out.println(parseName.getBuildJobName());
    }

    @Test
    public void testGetCommit() {
        // Arrange
        String expected = "commit";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setCommit("expected");

        System.out.println(parseName.getCommit());
    }

    @Test
    public void testGetChangelist() {
        // Arrange
        String expected = "changelist";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setChangelist("expected");

        System.out.println(parseName.getChangelist());
    }

    @Test
    public void testToString() {
        // Arrange
        String expected = "package 1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackage("expected");
        parseName.Version("expected");

        System.out.println(parseName.toString());
    }

    @Test
    public void testHashCode() {
        // Arrange
        String expected = "package 1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setPackage("expected");
        parseName.Version("expected");

        System.out.println(parseName.hashCode());
    }

    @Test
    public void testEquals() {
        // Arrange
        String expected = "package 1.0";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName1 = new AppVersion();
        parseName1.setPackage("expected");
        parseName1.Version("expected");

        AppVersion parseName2 = new AppVersion();
        parseName2.setPackage("expected");
        parseName2.Version("expected");

        System.out.println(parseName1.equals(parseName2));
    }

}