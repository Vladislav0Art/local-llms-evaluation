package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameGivenNonQualifiedAmiNameTest {

    @Test
    public void parseNameGivenNonQualifiedAmiNameTest() {
        AppVersion result = AppVersion.parseName("non-qualified-name");
        assertNull(result);
    }

}