package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testHashCode() {
        String amiName = "ami-12345";
        AppVersion parsedVersion = AppVersion.parseName(amiName);

        // Make sure hashCode method is implemented correctly for this class
        Assert.assertEquals(0, new AppVersion().hashCode());

        // Test with same object and different values to see that hashCode returns 0
        assertEquals(0, parsedVersion.hashCode());
    }

}