package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("name-build1-commit1");
        Assert.assertNotNull(appVersion);
    }

}