package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String sample = "ami-01234567890abcdef";
        AppVersion expected = new AppVersion(sample);
        AppVersion result = AppVersion.parseName(sample);

        assertEquals(expected, result);
    }

    @Test
    public void compareToTest() {
        AppVersion app1 = new AppVersion("1.0.0");
        AppVersion app2 = new AppVersion("1.0.1");

        assertTrue(app1.compareTo(app2) < 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion test = new AppVersion("testName");
        assertEquals("testName", test.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion test = new AppVersion("1.0.0");
        assertEquals("1.0.0", test.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion test = new AppVersion("testJobName");
        assertEquals("testJobName", test.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion test = new AppVersion("123");
        assertEquals("123", test.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion test = new AppVersion("commitTest");
        assertEquals("commitTest", test.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion test = new AppVersion("ChangeListTest");
        assertEquals("ChangeListTest", test.getChangelist());
    }

    @Test
    public void toStringTest() {
        String sample = "ami-01234567890abcdef";
        AppVersion test = new AppVersion(sample);

        assertTrue(test.toString().contains(sample));
    }

    @Test
    public void hashCodeTest() {
        AppVersion test = new AppVersion("hashCode");
        assertEquals(test.hashCode(), new AppVersion("hashCode").hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion app1 = new AppVersion("ami");
        AppVersion app2 = new AppVersion("ami");

        assertTrue(app1.equals(app2));
    }

}