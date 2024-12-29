package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestParseName {

    @Mock
    private Pattern getAppVersionPattern() throws Exception;

    private Matcher matcher;
    private String expectedPackage;
    private String expectedVersion;
    private String expectedBuildJobName;
    private String expectedBuildNumber;
    private String expectedCommit;
    private String expectedChangelist;

    @Test
    public void testParseName() {
        appVersion = AppVersion.parseName("ami-name-123");
        matcher = getAppVersionPattern();
        while (matcher.find()) {
            assertEquals(expectedPackage, matcher.group(1));
            matcher.reset();
            matcher = getAppVersionPattern();
            while (matcher.find()) {
                assertEquals(expectedVersion, matcher.group(1));
                matcher.reset();
                matcher = getAppVersionPattern();
                while (matcher.find()) {
                    assertEquals(expectedBuildJobName, matcher.group(1));
                    matcher.reset();
                    matcher = getAppVersionPattern();
                    while (matcher.find()) {
                        assertEquals(expectedBuildNumber, matcher.group(1));
                        matcher.reset();
                        matcher = getAppVersionPattern();
                        while (matcher.find()) {
                            assertEquals(expectedCommit, matcher.group(1));
                            matcher.reset();
                            matcher = getAppVersionPattern();
                            while (matcher.find()) {
                                assertEquals(expectedChangelist, matcher.group(1));
                            }
                        }
                    }
                }
            }
        }
    }

}