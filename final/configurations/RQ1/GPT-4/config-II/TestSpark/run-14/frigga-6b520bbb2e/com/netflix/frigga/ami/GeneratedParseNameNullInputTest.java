package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullInputTest {

    @Test
    public void parseNameNullInputTest() {
        String name = null;
        AppVersion ver = AppVersion.parseName(name);
        assertNull(ver);
    }

}