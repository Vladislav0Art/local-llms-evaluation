package com.netflix.frigga.ami;

public class GeneratedTestIsValid {

    public enum NameConstant {
        // Define constants here...
    }
}

public class AppVersion {
    private String version;
    private String packageName;

    public AppVersion(String version) {
        this.version = version;
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("[0-9]+");
    }

    public String getPackageName() {
        return NameConstants.NameConstant.PACKAGE_NAME;
    }

    public static String getVersion() {
        return AppVersion.class.getSimpleName();
    }

    public static String getBuildJobName() {
        return "Build Job Name";
    }

    public static String getBuildNumber() {
        return "12345";
    }

    public String getCommit() {
        return "Commit Hash";
    }

    public static boolean isValid(String input) {
        Pattern pattern = getAppVersionPattern();
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}

public class GeneratedTest {

    @Before
    public void setup() throws Exception {
        // Set up any test data here...
    }

    @Test
    public void testIsValid() {
        assertTrue(AppVersion.isValid("12345"));
    }

}