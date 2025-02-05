package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNonMatchingStringTest {

    @Test
    public void parseNameNonMatchingStringTest() {
        assertNull(AppVersion.parseName("nonMatching"));
    }

}