package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNameTestNullInput {

    @Test
    public void parseNameTestNullInput() {
        AppVersion version = AppVersion.parseName(null);
        Assert.assertNull(version);
    }

}