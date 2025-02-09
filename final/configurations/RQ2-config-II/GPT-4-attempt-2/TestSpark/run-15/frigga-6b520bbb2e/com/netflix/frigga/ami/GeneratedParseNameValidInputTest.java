package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion result = AppVersion.parseName("validAmiName");
        Assert.assertNotNull(result);
    }

}