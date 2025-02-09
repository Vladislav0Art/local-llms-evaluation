package com.netflix.frigga.ami;

public class GeneratedTestGeneratedTest {

    private String appVersion;

    public static AppVersion parseName(String name) {
        // implement your logic here to parse name
        return new AppVersion();
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }
}

public class CustomTestRunner extends TestSuite {
    @Override
    public void addRules(TestRule... rules) throws Exception {
        super.addRules(rules);
    }

    @Override
    protected String getOutput() {
        return "";
    }
}

public class GeneratedTest {
    @Rule
    public TestRule rule = new CustomTestRunner();

    @Test
    public void testGeneratedTest() throws Exception {
        AppVersion appVersion1 = when(AppVersion::parseName)
                .withArguments("ami-0")
                .thenReturn(new AppVersion());
        verify(appVersion1).setAppVersion("ami-0");

        AppVersion appVersion2 = when(AppVersion::parseName)
                .withArguments("ami-1")
                .thenReturn(new AppVersion());
        verify(appVersion2).setAppVersion("ami-1");
    }

}