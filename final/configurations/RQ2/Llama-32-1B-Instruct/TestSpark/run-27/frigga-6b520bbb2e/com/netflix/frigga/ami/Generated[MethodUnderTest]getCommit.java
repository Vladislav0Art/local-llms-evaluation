package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.AppVersionTestUtils;
import org.junit.Test;

public class Generated[MethodUnderTest]

getCommit {

    @Test
    public void [MethodUnderTest]getCommit() {
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