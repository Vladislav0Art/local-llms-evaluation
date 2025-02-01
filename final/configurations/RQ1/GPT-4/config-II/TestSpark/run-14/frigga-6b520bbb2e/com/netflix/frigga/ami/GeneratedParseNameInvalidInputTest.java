package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidInputTest {

    @Test
    public void parseNameInvalidInputTest() {
        String name = "wrong-pattern";
        AppVersion ver = AppVersion.parseName(name);
        assertNull(ver);
    }

}