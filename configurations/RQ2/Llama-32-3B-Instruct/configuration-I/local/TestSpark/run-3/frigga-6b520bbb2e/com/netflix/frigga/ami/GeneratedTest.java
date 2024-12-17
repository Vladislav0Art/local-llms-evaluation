package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;

    public static AppVersion createAppVersion(String version) {
        return new AppVersion(version);
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("\\d+(?:\\.\\d+)+");
    }
}

public class GeneratedTest {

}