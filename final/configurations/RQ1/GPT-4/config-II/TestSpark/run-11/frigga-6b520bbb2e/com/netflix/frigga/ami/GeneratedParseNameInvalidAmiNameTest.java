package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidAmiNameTest {

    @Test
    public void parseNameInvalidAmiNameTest() {
        assertNull(AppVersion.parseName("not-valid-0.0.0-123459"));
    }

}