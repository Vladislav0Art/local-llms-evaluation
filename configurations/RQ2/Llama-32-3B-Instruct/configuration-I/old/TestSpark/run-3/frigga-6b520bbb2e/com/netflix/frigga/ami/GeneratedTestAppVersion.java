package com.netflix.frigga.ami;

public class GeneratedTestAppVersion {

    private String version;

    public AppVersion(String version) {
        this.version = version;
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("\\d+(?:\\.\\d+)+");
    }
}

public class GeneratedTest {

    @Test
    public void testAppVersion() {
        AppVersion appVersion1 = new AppVersion("1.2.3");
        AppVersion appVersion2 = new AppVersion("v1.2.3");

        assertThat(AppVersion.getAppVersionPattern(), is(Pattern.compile("\\d+(?:\\.\\d+)+")));
    }

}