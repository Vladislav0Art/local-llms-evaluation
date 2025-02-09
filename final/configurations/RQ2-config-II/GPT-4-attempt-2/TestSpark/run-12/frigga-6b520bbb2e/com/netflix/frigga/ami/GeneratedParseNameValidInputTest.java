package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        String amiName = "ami-example-hvm";
        AppVersion result = AppVersion.parseName(amiName);
        Assert.assertNotNull(result);
    }

}