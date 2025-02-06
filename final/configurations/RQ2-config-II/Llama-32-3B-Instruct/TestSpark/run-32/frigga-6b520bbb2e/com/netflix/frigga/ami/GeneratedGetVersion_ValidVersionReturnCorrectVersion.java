package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ValidVersionReturnCorrectVersion {

    @Test
    public void getVersion_ValidVersionReturnCorrectVersion() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals(34, Integer.parseInt(version.getVersion()));
    }

}