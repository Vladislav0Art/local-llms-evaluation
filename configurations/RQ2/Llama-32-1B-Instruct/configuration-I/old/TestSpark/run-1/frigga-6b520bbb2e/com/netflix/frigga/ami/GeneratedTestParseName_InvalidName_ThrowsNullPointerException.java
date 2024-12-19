package com.netflix.frigga.ami;

public class GeneratedTestParseName_InvalidName_ThrowsNullPointerException {

    private MockAppVersion mockAppVersion;

    @Before
    public void setup() {
    }

    public AppVersionTest() {
        mockAppVersion = new MockAppVersion();
    }

    @Test
    public void testParseName_InvalidName_ThrowsNullPointerException() {
        String amiName = null;
        try {
            AppVersion.parseName(amiName);
            assert false;
        } catch (NullPointerException e) {
            // Expected
        }
    }

}