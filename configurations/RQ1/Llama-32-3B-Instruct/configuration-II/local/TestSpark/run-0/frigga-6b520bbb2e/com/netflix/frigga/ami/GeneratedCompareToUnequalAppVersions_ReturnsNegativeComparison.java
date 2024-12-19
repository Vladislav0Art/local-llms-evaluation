package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCompareToUnequalAppVersions_ReturnsNegativeComparison {

    @Test
    public void compareToUnequalAppVersions_ReturnsNegativeComparison() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("package1");
        appVersion1.setVersion("version1");
        appVersion1.setBuildJobName("buildJobName1");
        appVersion1.setBuildNumber("buildNumber1");
        appVersion1.setCommit("commit1");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("package2");
        appVersion2.setVersion("version2");
        appVersion2.setBuildJobName("buildJobName2");
        appVersion2.setBuildNumber("buildNumber2");
        appVersion2.setCommit("commit2");

        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}