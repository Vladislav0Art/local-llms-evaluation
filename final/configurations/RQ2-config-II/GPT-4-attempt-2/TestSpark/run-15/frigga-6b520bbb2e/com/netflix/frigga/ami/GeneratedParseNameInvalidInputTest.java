package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedParseNameInvalidInputTest {

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion.parseName(null);
    }

}