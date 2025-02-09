package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion version = AppVersion.parseName("ami-example-hvm");
        Assert.assertEquals("changelist", version.getChangelist());
    }

}