package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetChangelist {

    private AppVersion appVersion;

    @Test
    public void testGetChangelist() {
        // DO NOT USE MOCKING FOR THIS TEST
        // This method is deprecated and does not return a value.
    }

    @Before
    public void setupMockData() {
        mockName = "mockPackage";
        Pattern pattern = Pattern.compile("^\\w+");
        Matcher matcher = pattern.matcher(appVersion.getVersion());
        if (matcher.find()) {
            appVersion.setVersion(mockName);
        }
    }

    @After
    public void tearDown() {
    }

}