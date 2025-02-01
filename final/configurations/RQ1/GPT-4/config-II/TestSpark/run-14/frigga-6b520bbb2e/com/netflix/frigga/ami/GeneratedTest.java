package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertNotNull(ver);
        assertEquals("subscriberha", ver.getPackageName());
        assertEquals("1.0.0", ver.getVersion());
        assertEquals("150", ver.getBuildNumber());
        assertEquals("WE-WAPP-subscriberha", ver.getBuildJobName());
        assertEquals("586499", ver.getCommit());
    }

    @Test
    public void parseNameNullInputTest() {
        String name = null;
        AppVersion ver = AppVersion.parseName(name);
        assertNull(ver);
    }

    @Test
    public void parseNameInvalidInputTest() {
        String name = "wrong-pattern";
        AppVersion ver = AppVersion.parseName(name);
        assertNull(ver);
    }

    @Test
    public void compareToTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver1 = AppVersion.parseName(name);
        AppVersion ver2 = AppVersion.parseName(name);

        assertEquals(0, ver1.compareTo(ver2));
    }

    @Test
    public void nullSafeStringComparatorEqualTest() {
        AppVersion ver = new AppVersion();

        int result = ver.nullSafeStringComparator("equal", "equal");
        assertEquals(0, result);
    }

    @Test
    public void nullSafeStringComparatorNotEqualTest() {
        AppVersion ver = new AppVersion();

        int result = ver.nullSafeStringComparator("not", "equal");
        assertTrue(result != 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("subscriberha", ver.getPackageName());
    }

    @Test
    public void getVersionAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("1.0.0", ver.getVersion());
    }

    @Test
    public void getBuildJobNameAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("WE-WAPP-subscriberha", ver.getBuildJobName());
    }

    @Test
    public void getBuildNumberAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("150", ver.getBuildNumber());
    }

    @Test
    public void getCommitAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("586499", ver.getCommit());
    }

    @Test
    public void getChangelistAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals("586499", ver.getChangelist());
    }

    @Test
    public void toStringAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertTrue(ver.toString().contains("packageName=subscriberha"));
    }

    @Test
    public void hashCodeAfterParseNameTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver = AppVersion.parseName(name);

        assertEquals(1581862084, ver.hashCode());
    }

    @Test
    public void equalsNullObjectTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver1 = AppVersion.parseName(name);

        assertFalse(ver1.equals(null));
    }

    @Test
    public void equalsSameObjectTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver1 = AppVersion.parseName(name);

        assertTrue(ver1.equals(ver1));
    }

    @Test
    public void equalsEqualObjectsTest() {
        String name = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion ver1 = AppVersion.parseName(name);
        AppVersion ver2 = AppVersion.parseName(name);

        assertTrue(ver1.equals(ver2));
    }

    @Test
    public void equalsNotEqualObjectsTest() {
        String name1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String name2 = "subscriberhb-1.0.0-586499.h150/WE-WAPP-subscriberhb/150";
        AppVersion ver1 = AppVersion.parseName(name1);
        AppVersion ver2 = AppVersion.parseName(name2);

        assertFalse(ver1.equals(ver2));
    }

}