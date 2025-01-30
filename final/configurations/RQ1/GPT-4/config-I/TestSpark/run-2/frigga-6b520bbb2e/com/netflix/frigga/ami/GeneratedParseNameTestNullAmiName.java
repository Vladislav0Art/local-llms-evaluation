package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTestNullAmiName {

    @Test
    public void parseNameTestNullAmiName() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

}