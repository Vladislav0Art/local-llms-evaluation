package com.netflix.frigga.ami;

public class GeneratedParseName_EmptyInput_ReturnsNull {

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
    public void parseName_EmptyInput_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

}