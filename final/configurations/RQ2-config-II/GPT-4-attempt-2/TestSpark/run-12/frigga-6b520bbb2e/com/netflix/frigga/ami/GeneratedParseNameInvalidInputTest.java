package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameInvalidInputTest {

    @Test
    public void parseNameInvalidInputTest() {
        String amiName = "";
        AppVersion.parseName(amiName);
    }

}