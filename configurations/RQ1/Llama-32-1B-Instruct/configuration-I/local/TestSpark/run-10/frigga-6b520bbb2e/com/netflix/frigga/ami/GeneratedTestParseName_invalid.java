package com.netflix.frigga.ami;

public class GeneratedTestParseName_invalid {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParseName_invalid() throws Exception {
        String amiName = " subscriberha-  1.0.0 -586499";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}