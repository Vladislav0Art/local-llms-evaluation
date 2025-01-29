package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest]

    parseName() {
        String amiName = "ami-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertTrue("Name not found", !appVersion.getName().isEmpty());
    }

    @Test
    public void [MethodUnderTest]

    getPackageName() {
        String amiName = "ami-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals("Package name", appVersion.getPackageName(), NameConstants.AMI_PACKAGE_NAME);
    }

    @Test
    public void [MethodUnderTest]

    compareTo() {
        String[] packNames1 = {"pack-1", "pack-2"};
        String[] packNames2 = {"pack-1", "pack-3"};

        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("ami-package-name");

        int result = appVersion.compareTo(appVersion2);
        Assert.assertEquals(-1, result); // should be -1 because it's less than packNames1[0]

        String[] packNames3 = {"pack-4", "pack-5"};
        Result result2 = AppVersion.parseName("ami-package-name");
        int result3 = appVersion.compareTo(result2);
        Assert.assertEquals(1, result3); // should be 1 because it's greater than packNames3[0]

        AppVersion appVersion4 = AppVersion.parseName("ami-package-name");

        Result result4 = AppVersion.parseName("ami-name");
        int result5 = appVersion.compareTo(result4);
        Assert.assertEquals(1, result5); // should be 1 because it's greater than packNames2[0]
    }

    @Test
    public void [MethodUnderTest]

    getBuildJobName() {
        String[] buildJobs1 = {"build-job-1", "build-job-2"};
        String[] buildJobs2 = {"build-job-3", "build-job-4"};

        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("ami-package-name");

        Assert.assertEquals("Build job name 1", appVersion1.getBuildJobName(), BuildJobName.BUILD_JOB_NAME_1);
        Assert.assertEquals("Build job name 2", appVersion2.getBuildJobName(), BuildJobName.BUILD_JOB_NAME_2);

        Result result3 = AppVersion.parseName("ami-package-name");
        String expectedBuildJobName = BuildJobName.BUILD_JOB_NAME_2;
        Assert.assertEquals(expectedBuildJobName, result3.getBuildJobName());
    }

    @Test
    public void [MethodUnderTest]

    getBuildNumber() {
        String[] buildNumbers1 = {"build-number-1", "build-number-2"};
        String[] buildNumbers2 = {"build-number-3", "build-number-4"};

        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("ami-package-name");

        Assert.assertEquals("Build number 1", appVersion1.getBuildNumber(), BuildNumber.BUILD_NUMBER_1);
        Assert.assertEquals("Build number 3", appVersion2.getBuildNumber(), BuildNumber.BUILD_NUMBER_3);

        Result result3 = AppVersion.parseName("ami-package-name");
        String expectedBuildNumber = BuildNumber.BUILD_NUMBER_2;
        Assert.assertEquals(expectedBuildNumber, result3.getBuildNumber());
    }

    @Test
    public void [MethodUnderTest]

    getCommit() {
        String[] commits1 = {"commit-1", "commit-2"};
        String[] commits2 = {"commit-3", "commit-4"};

        AppVersion appVersion1 = AppVersion.parseName("ami-name");
        AppVersion appVersion2 = AppVersion.parseName("ami-package-name");

        Assert.assertEquals("Commit 1", appVersion1.getCommit(), Commit.CUMPLEMENT_1);
        Assert.assertEquals("Commit 3", appVersion2.getCommit(), Commit.CUMPLEMENT_3);

        Result result3 = AppVersion.parseName("ami-package-name");
        String expectedCommit = Commit.CUMPLEMENT_2;
        Assert.assertEquals(expectedCommit, result3.getCommit());
    }

}