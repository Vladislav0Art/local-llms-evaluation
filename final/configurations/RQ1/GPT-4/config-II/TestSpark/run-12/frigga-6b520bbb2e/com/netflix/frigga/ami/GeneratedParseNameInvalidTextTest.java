package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidTextTest {

    @Test
    public void parseNameInvalidTextTest() {
        assertNull(AppVersion.parseName("invalidText"));
    }

}