package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

    private String version;
    private static final Pattern APP_VERSION_PATTERN = Pattern.compile("[0-9]+");
    public static final String PACKAGE_NAME = NameConstants.NameConstant.PACKAGE_NAME;

    public AppVersion(String version) {
        this.version = version;
    }

    public static boolean isValid(String input) {
        Matcher matcher = APP_VERSION_PATTERN.matcher(input);
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

    @Test
    public void testGetAppVersionPattern() {
        Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("12345");
        assertTrue(matcher.find());
    }

}