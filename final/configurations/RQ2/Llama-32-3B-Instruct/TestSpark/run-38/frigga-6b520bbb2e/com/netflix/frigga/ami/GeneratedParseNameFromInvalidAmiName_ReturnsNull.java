package com.netflix.frigga.ami;

public class GeneratedParseNameFromInvalidAmiName_ReturnsNull {

    private String package_;
    private String buildJobName;
    private String commitHash;

    public static AppVersion parseName(String name) {
        Pattern pattern = Pattern.compile("(.*)-([0-9a-f]+)");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return new AppVersion(
                    matcher.group(1),
                    "",
                    matcher.group(2)
            );
        } else {
            return null;
        }
    }

    public String getPackage() {
        return package_;
    }

    public void setPackage(String package_) {
        this.package_ = package_;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }
}

public class GeneratedTest {

    @Test
    public void parseNameFromInvalidAmiName_ReturnsNull() {
        String amiName = "invalid-ami-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}