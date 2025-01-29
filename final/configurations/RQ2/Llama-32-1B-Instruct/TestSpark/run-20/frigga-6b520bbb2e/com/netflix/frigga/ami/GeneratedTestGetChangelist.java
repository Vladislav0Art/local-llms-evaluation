package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testGetChangelist() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        // No changelist available, test should fail
        assertThrows(IllegalArgumentException.class, () -> parsedVersion.getChangelist());
    }

}