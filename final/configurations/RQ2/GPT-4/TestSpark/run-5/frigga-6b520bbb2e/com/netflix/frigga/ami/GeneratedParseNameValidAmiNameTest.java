package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameValidAmiNameTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String validAmiName = "validAmiName";
        Assert.assertNotNull(AppVersion.parseName(validAmiName));
    }

}