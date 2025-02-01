package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullAmiNameTest {

    @Test
    public void parseNameNullAmiNameTest() {
        assertNull(AppVersion.parseName(null));
    }

}