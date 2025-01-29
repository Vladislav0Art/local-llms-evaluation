package com.netflix.frigga.ami;

public class GeneratedTestMyPackage {

    @Test
    public void testMyPackage() {
        assertEquals("mockPackage", mockVersion.getVersion());
    }

    @Before
    public void setup() {
        // Initialize appVersion variable
        AppVersion mockAppVersion = new AppVersion();

        // Initialize mockBuildJobName method
        String mockBuildJobName = NameConstants.FRIGGA_AMI_NAME;
        mockAppVersion.setBuildJobName(mockBuildJobName);

        // Initialize mockCommit method
        mockAppVersion.setCommit("mockCommit");

        // Set appVersion variable
        appVersion = mockAppVersion;
    }

    @After
    public void tearDown() {
        // Reset appVersion and mockAppVersion variables to their default values
        appVersion = new AppVersion();
        mockAppVersion = new AppVersion();
    }
}

}