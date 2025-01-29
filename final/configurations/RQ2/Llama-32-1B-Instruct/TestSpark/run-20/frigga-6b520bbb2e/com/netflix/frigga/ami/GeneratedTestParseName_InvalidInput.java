package com.netflix.frigga.ami;

public class GeneratedTestParseName_InvalidInput {

    private AppVersion appVersion;

    @Before
    public void setup() {
        // No setup needed for now, just running the test
    }

    @Test
    public void testParseName_InvalidInput() {
        String invalidAmiName = "invalid-12345";
        Map<String, String> exceptionMap = new HashMap<>();
        exceptionMap.put(AppConstants.ERROR_INVALID_AMI_NAME, "Error");
        try {
            AppVersion.parseName(invalidAmiName);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Error", e.getMessage());
        }
    }

}