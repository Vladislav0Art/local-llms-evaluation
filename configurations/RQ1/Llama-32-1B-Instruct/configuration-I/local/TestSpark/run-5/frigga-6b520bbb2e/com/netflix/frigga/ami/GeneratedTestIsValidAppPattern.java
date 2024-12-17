package com.netflix.frigga.ami;

public class GeneratedTestIsValidAppPattern {

    /**
     * Verifies if the given package name is a valid app pattern.
     *
     * @param packageName The package name to verify.
     * @return true if the package name is a valid app pattern, false otherwise.
     */
    public static boolean isValidAppPattern(String packageName) {
        Pattern pattern = AppVersionUtils.APP_VERSION_PATTERN;
        Matcher matcher = pattern.matcher(packageName);
        return matcher.matches();
    }

    /**
     * Verifies if the given commit is a valid app version.
     *
     * @param commit The commit to verify.
     * @return true if the commit is a valid app version, false otherwise.
     */
    public static boolean isValidAppVersion(String commit) {
        return !commit.isEmpty();
    }

    /**
     * Verifies that two strings have the same substring between certain indices.
     *
     * @param str1 The first string to compare.
     * @param str2 The second string to compare.
     * @return true if the strings have the same substring, false otherwise.
     */
    public static int nullSafeStringComparator(String one, String two) {
        int result = 0;
        for (int i = 0; i < Math.min(one.length(), two.length()); i++) {
            if (one.charAt(i) == two.charAt(i)) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    /**
     * Verifies that the given build job name and version are valid app versions.
     *
     * @param buildJobName The build job name to verify.
     * @param buildVersion The build version to verify.
     * @return true if the build job name and version are valid app versions, false otherwise.
     */
    public static boolean isValidBuildVersion(String buildJobName, String buildVersion) {
        return !buildJobName.isEmpty() && !buildVersion.isEmpty();
    }

    /**
     * Verifies that two strings have a common identifier.
     *
     * @param str1 The first string to compare.
     * @param str2 The second string to compare.
     * @return true if the strings have a common identifier, false otherwise.
     */
    public static boolean hasCommonIdentifier(String one, String two) {
        return !one.isEmpty() && !two.isEmpty() && !one.equals(two);
    }
}

public class AppVersionTest {

    private static final AppVersionUtils.AppVersionUtils AppVersionUtils = new AppVersionUtils();

    @Test
    public void testIsValidAppPattern() {
        assertEquals(true, AppVersionUtils.isValidAppPattern("package1"));
        assertEquals(false, AppVersionUtils.isValidAppPattern("invalid"));
    }

}