package com.netflix.frigga.ami;

public class GeneratedTest {

    public void addRules(TestRule... rules) throws Exception {
        super.addRules(rules);
    }

    @Override
    protected String getOutput() {
        return "";
    }
}

public class AppVersion {
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

public class GeneratedTest extends TestCase {
    @Rule
    public TestRule rule = new CustomTestRunner();

    @Test
    public void parseName_WhenAminameIsEmpty_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        when(getAppVersionPatternMock).thenReturn(Pattern.compile(".*"));
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertEquals(pattern, getAppVersionPatternMock);
    }

}