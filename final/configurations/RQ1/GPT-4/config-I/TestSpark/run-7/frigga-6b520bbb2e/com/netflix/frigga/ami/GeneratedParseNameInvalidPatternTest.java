package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameInvalidPatternTest {

    @Test
    public void parseNameInvalidPatternTest() {
        String invalidAmiName = "ThisIsInvalid";
        AppVersion result = AppVersion.parseName(invalidAmiName);
        Assert.assertNull(result);
    }

}