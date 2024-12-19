package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCompareToEqualAppVersions_ReturnsZeroComparison {

    @Test
    public void compareToEqualAppVersions_ReturnsZeroComparison() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("package1");
        appVersion1.setVersion("version1");
        appVersion1.setBuildJobName("buildJobName1");
        appVersion1.setBuildNumber("buildNumber1");
        appVersion1.setCommit("commit1");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("package1");
        appVersion2.setVersion("version1");
        appVersion2.setBuildJobName("buildJobName1");
        appVersion2.setBuildNumber("buildNumber1");
        appVersion2.setCommit("commit1");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}