package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion.getCommit(), appVersion.getChangelist());
    }

}