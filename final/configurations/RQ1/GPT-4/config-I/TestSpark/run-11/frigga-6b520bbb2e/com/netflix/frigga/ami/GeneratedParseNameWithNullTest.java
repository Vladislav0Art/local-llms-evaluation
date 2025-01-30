package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedParseNameWithNullTest {

    @Test
    public void parseNameWithNullTest() {
        assertNull(AppVersion.parseName(null));
    }

}