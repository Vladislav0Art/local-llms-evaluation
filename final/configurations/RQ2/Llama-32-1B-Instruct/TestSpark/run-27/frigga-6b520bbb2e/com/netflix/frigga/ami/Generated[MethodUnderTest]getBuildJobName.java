package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class Generated[MethodUnderTest]

getBuildJobName {

    @Test
    public void [MethodUnderTest]getBuildJobName() {
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

}