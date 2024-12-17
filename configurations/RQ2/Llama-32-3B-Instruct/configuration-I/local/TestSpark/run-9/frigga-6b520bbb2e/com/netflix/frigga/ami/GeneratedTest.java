package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;

    public AppVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return version.split("-")[0];
    }

    public int getBuildNumber() {
        try {
            return Integer.parseInt(version.split("-")[1]);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

public class AppVersionTest {

}