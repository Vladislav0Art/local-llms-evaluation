package com.netflix.frigga.ami;

public class GeneratedTestParseName_hyphenated {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseName_hyphenated() throws Exception {
        String amiName = "subscriberha-1.0.0-586499";
        appVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", appVersion.packageName);
        assertEquals("1.0.0-586499", appVersion.version);
    }

}