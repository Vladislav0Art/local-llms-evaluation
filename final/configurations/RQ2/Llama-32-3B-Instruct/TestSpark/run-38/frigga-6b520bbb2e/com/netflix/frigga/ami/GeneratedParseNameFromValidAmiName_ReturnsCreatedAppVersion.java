package com.netflix.frigga.ami;

public class GeneratedParseNameFromValidAmiName_ReturnsCreatedAppVersion {

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
    public void parseNameFromValidAmiName_ReturnsCreatedAppVersion() {
        String amiName = "1.0.2-20220101";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0.2", appVersion.getPackage());
    }

}