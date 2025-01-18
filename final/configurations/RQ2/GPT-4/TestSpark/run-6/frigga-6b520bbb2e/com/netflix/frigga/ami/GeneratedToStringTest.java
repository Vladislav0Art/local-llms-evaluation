package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("name-version1-build1-commit1-changelist1");
        Assert.assertEquals("AppVersion{name='name', version='version1', amount='build1', commit='commit1', changelist='changelist1'}", appVersion.toString());
    }

}