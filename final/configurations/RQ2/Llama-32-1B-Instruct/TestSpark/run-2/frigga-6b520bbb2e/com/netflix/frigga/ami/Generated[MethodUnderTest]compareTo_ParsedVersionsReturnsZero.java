package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[MethodUnderTest]

compareTo_ParsedVersionsReturnsZero {

    @Test
    public void [MethodUnderTest]compareTo_ParsedVersionsReturnsZero() {
        AppVersion version1 = AppVersion.parseName("ami-12345678");
        AppVersion version2 = AppVersion.parseName("ami-fake-version");
        int comparisonResult = AppVersion.compareTo(version1, version2);
        assertEquals(0, comparisonResult);
    }

}