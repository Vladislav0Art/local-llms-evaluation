package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("commit-hash", version.getCommit());
    }

}