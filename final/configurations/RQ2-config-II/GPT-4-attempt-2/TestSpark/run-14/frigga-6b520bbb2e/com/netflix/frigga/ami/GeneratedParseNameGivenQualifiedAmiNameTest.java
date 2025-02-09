package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameGivenQualifiedAmiNameTest {

    @Test
    public void parseNameGivenQualifiedAmiNameTest() {
        AppVersion result = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertNotNull(result);
    }

}