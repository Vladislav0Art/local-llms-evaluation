package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion thisVersion = AppVersion.parseName("version1");
        Assert.assertNotNull(thisVersion.getChangelist());
    }

}