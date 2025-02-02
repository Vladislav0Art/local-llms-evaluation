package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ReturnsExpectedValue {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public static AppVersion parseName(String name) {
        Pattern pattern = new Pattern();
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            int packageIndex = 0, versionIndex = 1, buildIndex = 2, commitIndex = 3;
            packageName = name.substring(packageIndex);
            String[] parts = name.substring(versionIndex + 1).split("-");
            if (parts.length > 0) {
                version = parts[0];
            }
            parts = name.substring(buildIndex + 1).split("-");
            if (parts.length > 0) {
                buildJobName = parts[0];
            } else {
                buildJobName = "";
            }
            String[] commitParts = name.substring(commitIndex + 1);
            if (commitParts.length > 0) {
                commit = commitParts[0];
            } else {
                commit = "";
            }
        }
        return this;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}

public class GeneratedTest {

    @Mock
    private Pattern pattern;

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("test");

        assertThat(appVersion.getBuildNumber(), is("test"));
    }

}