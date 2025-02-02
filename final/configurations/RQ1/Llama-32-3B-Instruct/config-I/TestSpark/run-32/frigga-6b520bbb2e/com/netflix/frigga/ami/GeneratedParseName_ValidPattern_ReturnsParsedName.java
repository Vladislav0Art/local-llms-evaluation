package com.netflix.frigga.ami;

public class GeneratedParseName_ValidPattern_ReturnsParsedName {

    private String packageName;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public static AppVersion parseName(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        // implement the logic to extract package and version from the name
        // for simplicity, assume the format is "package-name-version"
        String[] parts = name.split("-");
        if (parts.length != 2) {
            return null;
        }
        return new AppVersion().setPackageName(parts[0]).setPackageName(parts[1]);
    }

}

public class TestAppVersion {

    @Test
    public void parseName_ValidPattern_ReturnsParsedName() {
        String validName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(validName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0-586499", parsedName.getPackageName());
    }

}