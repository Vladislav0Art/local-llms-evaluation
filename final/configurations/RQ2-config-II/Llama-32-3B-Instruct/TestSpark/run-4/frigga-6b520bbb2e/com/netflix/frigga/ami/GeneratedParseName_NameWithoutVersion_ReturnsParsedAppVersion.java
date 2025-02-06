package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_NameWithoutVersion_ReturnsParsedAppVersion {

    @Test
    public void parseName_NameWithoutVersion_ReturnsParsedAppVersion() {
        String name = "123456";
        AppVersion result = AppVersion.parseName(name);
        assert result != null;
    }

}