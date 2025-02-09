package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameValidNameTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion version = AppVersion.parseName("validName");
        Assert.assertNotNull(version);
    }

}