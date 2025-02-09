package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameTestEmptyString {

    @Test
    public void parseNameTestEmptyString() {
        AppVersion version = AppVersion.parseName("");
        Assert.assertNull(version);
    }

}