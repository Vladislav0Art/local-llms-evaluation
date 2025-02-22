package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testCompareTo() {
        AppVersion version1 = new AppVersion();
        version1.setPackageName("packageName1");
        version1.setVersion("1.0.0");
        version1.setBuildJobName("buildJobName1");
        version1.setBuildNumber("1");
        version1.setCommit("commit1");

        AppVersion version2 = new AppVersion();
        version2.setPackageName("packageName2");
        version2.setVersion("2.0.0");
        version2.setBuildJobName("buildJobName2");
        version2.setBuildNumber("2");
        version2.setCommit("commit2");

        Assert.assertTrue(version1.compareTo(version2) < 0);
    }

}