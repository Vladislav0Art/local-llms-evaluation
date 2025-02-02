package com.netflix.frigga.ami;

public class GeneratedTest {

    private String packageName;
    private String version;

    public AppVersion(String packageName, String version) {
        this.packageName = packageName;
        this.version = version;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }

    public boolean isValidName(String name) {
        try {
            parsedName = parseName(name);
            return parsedName != null && parsedName.getPackageName().equals(packageName)
                    && parsedName.getVersion().equals(version);
        } catch (InvalidFormatException e) {
            return false;
        }
    }

    private static AppVersion parsedName;

    public static AppVersion parseName(String name) throws InvalidFormatException {
        if (parsedName == null || !parsedName.getPackageName().equals(name.substring(0, name.indexOf('/'))))
            parsedName = new AppVersion(name.substring(0, name.indexOf('/')), name.substring(name.indexOf('/') + 1));
        return parsedName;
    }

    public static class Test {

        @Test
        public void testParseValid() throws Exception {
            assertEquals("com.example.package", AppVersion.parseName("com.example.package/1.0.0-586499").getPackageName());
            assertEquals("1.0.0-586499", AppVersion.parseName("com.example.package/1.0.0-586499").getVersion());
        }

        @Test
        public void testParseInvalid() throws Exception {
            assertNull(AppVersion.parseName("").getPackageNam);
        }

        @Test
        public void testGetPackage() throws Exception {
            assertEquals("com.example.package", AppVersion.getPackage(new AppVersion("com.example.package", "1.0.0-586499")));
        }

        @Test
        public void testGetVersion() throws Exception {
            assertEquals("1.0.0-586499", AppVersion.getVersion(new AppVersion("com.example.package", "1.0.0-586499")));
        }

        @Test
        public void testGetInvalidName() throws Exception {
            assertFalse(AppVersion.isValidName(""));
        }

        @Test
        public void testGetValidName() throws Exception {
            assertTrue(AppVersion.isValidName("com.example.package/1.0.0-586499"));
        }
    }

}