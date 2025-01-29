package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_getCommit {

    @Test
    public void test_getCommit() {
        AppVersion appVersion = new AppVersion();
        String commit = appVersion.getCommit();
        assertEquals(NameConstants.AMI_COMMIT.toLowerCase(), commit);
    }

}