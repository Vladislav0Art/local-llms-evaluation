package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;

    public AppVersion(String version) {
        this.version = version;
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("[0-9]+");
    }

    public static boolean isValid(String input) {
        Matcher matcher = getAppVersionPattern().matcher(input);
        return matcher.find();
    }
}

public class NameConstants {
    public enum NameConstant {
        PACKAGE_NAME ="package_name"
    }
}

public class GeneratedTest {

    @Before
    public void setup() throws Exception {
        // Set up any test data here...
    }

}