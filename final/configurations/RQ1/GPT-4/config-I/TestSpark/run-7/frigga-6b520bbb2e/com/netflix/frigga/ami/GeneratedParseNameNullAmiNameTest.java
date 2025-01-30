package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameNullAmiNameTest {

    @Test
    public void parseNameNullAmiNameTest() {
        String nullAmiName = null;
        AppVersion result = AppVersion.parseName(nullAmiName);
        Assert.assertNull(result);
    }

}