package com.netflix.frigga.ami;

public class GeneratedTestParseName_empty {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseName_empty() {
        String amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}