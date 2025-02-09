package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("changelist.changelistHash");
        Assert.assertEquals("changelistHash", appVersion.getChangelist());
    }

}