package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

    private AppVersion appVersion;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHashCode() throws Exception {
        String amiName = "subscriberha-1.0.0-586499";
        appVersion = AppVersion.parseName(amiName);
        assertEquals(AppVersion.hashCode(), appVersion.hashCode());
    }

}