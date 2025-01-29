package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[MethodUnderTest]

compareTo_ParsedVersionsReturnsNegative {

    @Test
    public void [MethodUnderTest]compareTo_ParsedVersionsReturnsNegative() {
        AppVersion version1 = AppVersion.parseName("ami-12345678");
        AppVersion version2 = AppVersion.parseName("ami-fake-version");
        int comparisonResult = AppVersion.compareTo(version2, version1);
        assertTrue(comparisonResult < 0);
    }

}