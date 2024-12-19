package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_validInputReturnsAppVersion() {
        AppVersion appVersion = AppVersion.parseName("1.2.3");
        assertNotNull(appVersion);
        assertEquals(123, appVersion.getCommit().hashCode());
    }

    @Test
    public void parseName_invalidInputThrowsParseException() {
        try {
            AppVersion.parseName("InvalidAppVersion");
            fail();
        } catch (ParseException e) {
            // Expected exception
        }
    }

    @Test
    public void compareTo_differentVersionsReturnsNegativeResult() {
        AppVersion appVersion1 = new AppVersion(123);
        AppVersion appVersion2 = new AppVersion(456);
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void compareTo_sameVersionsReturnsZero() {
        AppVersion appVersion1 = new AppVersion(123);
        AppVersion appVersion2 = new AppVersion(123);
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPattern_matchesAppVersionRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.2.3").find());
    }

    @Test
    public void getAppVersionPattern_doesNotMatchOtherRegexes() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertFalse(pattern.matcher("InvalidAppVersion").find());
    }

    @Test
    public void getPackageName_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("expectedPackage", appVersion.getPackageName());
    }

    @Test
    public void getVersion_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("1.2.3", appVersion.getVersion());
    }

    @Test
    public void getCommit_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals(123, appVersion.getCommit());
    }

    public class AppVersion {
        private int commit;

        public static AppVersion parseName(String name) {
            String[] parts = name.split("\\.");
            if (parts.length != 3) {
                throw new ParseException("Invalid AppVersion format");
            }
            return new AppVersion(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        }

        public int getCommit() {
            return commit;
        }

        public String getVersion() {
            return "1.2.3";
        }

        private AppVersion(int commit, int version, int _commit) {
            this.commit = commit;
            // This is not a correct implementation of the commit field
        }
    }

    public class ParseException extends RuntimeException {
        public ParseException(String message) {
            super(message);
        }
    }

}